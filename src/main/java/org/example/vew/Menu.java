package org.example.vew;

import org.example.exceptions.menuExceptions.ChoiceOutOfItemList;
import org.example.exceptions.menuExceptions.EmptyChoiceException;
import org.example.exceptions.menuExceptions.NotNumberException;
import org.example.vew.comands.AddHuman;
import org.example.vew.comands.Command;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final List<Command> commands;

    public Menu(Console console) {
        commands = new ArrayList<>();
        commands.add(new AddHuman(console));
    }

    public String print() {
        StringBuilder menuStringBuilder = new StringBuilder();
        for (int i = 0; i < commands.size(); i++) {
            menuStringBuilder.append(i + 1).append(". ");
            menuStringBuilder.append(commands.get(i).getDescription());
        }
        return menuStringBuilder.toString();
    }

    public void execute(String choice) {
        if (choice.trim().isEmpty()) {
            throw new EmptyChoiceException();
        }

        if (!isInteger(choice)) {
            throw new NotNumberException();
        }

        if (Integer.parseInt(choice) > commands.size() || Integer.parseInt(choice) <= 0) {
            throw new ChoiceOutOfItemList();
        }

        commands.get(Integer.parseInt(choice) - 1).execute();
    }

    private boolean isInteger(String choice) {
        try {
            Integer.parseInt(choice);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }

}
