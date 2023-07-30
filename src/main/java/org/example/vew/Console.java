package org.example.vew;

import org.example.exceptions.addHumanException.EnteredMoreRequiredData;
import org.example.exceptions.addHumanException.NotAllDataEntered;
import org.example.exceptions.addHumanException.WrongGenderFormat;
import org.example.exceptions.menuExceptions.EmptyChoiceException;
import org.example.exceptions.menuExceptions.NotNumberException;
import org.example.exceptions.menuExceptions.ChoiceOutOfItemList;
import org.example.presenter.Presenter;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class Console implements View {
    Presenter presenter;
    private Scanner scanner;
    Menu menu;

    public Console() {
        presenter = new Presenter(this);
        menu = new Menu(this);
        scanner = new Scanner(System.in);
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }

    @Override
    public void start() {
        while (true) {
            try {
                System.out.println(menu.print());
                String choice = scanner.nextLine();
                menu.execute(choice);
            } catch (EmptyChoiceException | NotNumberException | ChoiceOutOfItemList exception) {
                System.err.println(exception.getMessage());
            }
        }
    }

    public void addHuman() {
        System.out.println("Введите одной строкой через пробел: [" +
                "Фамилия," +
                "Имя," +
                "Отчество," +
                "Дата рождения (dd.mm.yyyy)," +
                "пол (f, m)," +
                "Номер телефона]");

        try {
            List<String> data = getDataFromString(scanner.nextLine());
            String surname = data.get(0);
            String firstName = data.get(1);
            String lastName = data.get(2);
            LocalDate birthDate = getDateFromString(data.get(3));
            String gender = getGenderFromString(data.get(4));
            String phoneNumber = data.get(5);
            presenter.addHuman(surname, firstName, lastName, birthDate, gender, phoneNumber);
        } catch (NotAllDataEntered | EnteredMoreRequiredData | WrongGenderFormat e) {
            System.err.println(e.getMessage());
        } catch (DateTimeParseException e) {
            System.err.println("Вы ввели неверный формат даты рождения: " + e);
        }


    }

    private String getGenderFromString(String data) {
        if (!data.equals("f") && !data.equals("m")) {
            throw new WrongGenderFormat();
        }
        return data;
    }

    private List<String> getDataFromString(String data) {
        List<String> allData = List.of(data.split(" "));
        if (allData.size() < 6) {
            throw new NotAllDataEntered();
        }

        if (allData.size() > 6) {
            throw new EnteredMoreRequiredData();
        }

        return allData;
    }

    private LocalDate getDateFromString(String date) throws DateTimeParseException {
        return LocalDate.parse(date, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

}
