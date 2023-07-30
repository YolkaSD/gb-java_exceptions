package org.example.vew.comands;

import org.example.vew.Console;

public class AddHuman extends Command{
    private static final String ADD_HUMAN = "Добавить человека";

    public AddHuman(Console console) {
        super(console, ADD_HUMAN);
    }

    @Override
    public void execute() {
        super.getConsole().addHuman();
    }
}
