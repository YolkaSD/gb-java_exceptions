package org.example.model.save;

import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SaveToTXTFile implements SaveToFile{
    @Override
    public boolean saveToFile(String text, String path) {
        saveToTXTFile(text, path);
        return true;
    }

    private void saveToTXTFile(String text, String path) {
        Pattern pattern = Pattern.compile("<(.*?)>");
        Matcher matcher = pattern.matcher(text);
        String surname = null;
        if (matcher.find()) {
            surname = matcher.group(1);
        }

        path += "/" + surname + ".txt";
        try (FileWriter writer = new FileWriter(path, true)){
            writer.write(text + "\n");
            writer.flush();
        } catch (RuntimeException | IOException e) {
            System.err.println(e.getMessage());
        }
    }
}