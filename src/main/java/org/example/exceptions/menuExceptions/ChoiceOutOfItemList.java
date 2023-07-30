package org.example.exceptions.menuExceptions;

public class ChoiceOutOfItemList extends RuntimeException {

    public ChoiceOutOfItemList() {
        super("Вы выбрали не существующий пункт меню!");
    }
}
