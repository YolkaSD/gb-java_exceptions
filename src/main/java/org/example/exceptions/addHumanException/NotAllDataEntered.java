package org.example.exceptions.addHumanException;

public class NotAllDataEntered extends RuntimeException {
    public NotAllDataEntered() {
        super("Вы ввели не все данные!");
    }
}
