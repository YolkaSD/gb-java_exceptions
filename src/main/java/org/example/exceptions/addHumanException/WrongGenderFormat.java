package org.example.exceptions.addHumanException;

public class WrongGenderFormat extends RuntimeException{
    public WrongGenderFormat() {
        super("Неверный формат гендера!");
    }
}
