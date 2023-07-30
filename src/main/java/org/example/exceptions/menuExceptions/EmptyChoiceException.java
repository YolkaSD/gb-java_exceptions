package org.example.exceptions.menuExceptions;

public class EmptyChoiceException extends RuntimeException {
    public EmptyChoiceException() {
        super("Вы ничего не ввели!");
    }
}
