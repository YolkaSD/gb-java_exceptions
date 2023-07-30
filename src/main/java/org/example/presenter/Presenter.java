package org.example.presenter;

import org.example.model.DTO.HumanDTO;
import org.example.model.save.SaveToFile;
import org.example.model.save.SaveToTXTFile;
import org.example.vew.View;
import java.time.LocalDate;

public class Presenter {
    private HumanDTO humanDTO;
    private SaveToFile saveToFile;
    private View view;

    public Presenter(View view) {
        this.view = view;
        saveToFile = new SaveToTXTFile();
    }

    public void addHuman(String surname, String firstName, String lastName, LocalDate birthDate, String gender, String phoneNumber) {
        humanDTO = new HumanDTO(surname, firstName, lastName, birthDate, gender, phoneNumber);
        saveToFile.saveToFile(humanDTO.toString(), "src/main/resources/HumanFiles");
        view.print("Запись создана: " + humanDTO);
    }

}
