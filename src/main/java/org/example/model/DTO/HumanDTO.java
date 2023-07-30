package org.example.model.DTO;

import java.time.LocalDate;
import java.util.Date;

public class HumanDTO {
    private String surname;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String gender;
    private String phoneNumber;

    public HumanDTO(String surname, String firstName, String lastName, LocalDate birthDate, String gender, String phoneNumber) {
        this.surname = surname;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s><%s><%s>", surname, firstName, lastName, birthDate, gender, phoneNumber);
    }
}
