package org.example.vew.comands;

import org.example.vew.Console;

public abstract class Command {
    private Console console;
    private String description;

    public Command(Console console, String description) {
        this.console = console;
        this.description = description;
    }

    public Console getConsole() {
        return console;
    }

    public String getDescription() {
        return description;
    }

    public abstract void execute();
}
