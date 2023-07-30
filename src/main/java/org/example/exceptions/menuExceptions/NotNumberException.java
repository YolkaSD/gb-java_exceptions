package org.example.exceptions.menuExceptions;

public class NotNumberException extends RuntimeException {
    public NotNumberException() {
        super("Вы ввели строку, вместо числа!");
    }
}
