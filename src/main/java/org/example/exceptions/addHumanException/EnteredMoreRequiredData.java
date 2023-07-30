package org.example.exceptions.addHumanException;

public class EnteredMoreRequiredData extends RuntimeException {
    public EnteredMoreRequiredData() {
        super("Вы ввели лишние данные!");
    }
}
