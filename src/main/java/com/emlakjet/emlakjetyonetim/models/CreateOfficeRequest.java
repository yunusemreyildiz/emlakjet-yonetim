package com.emlakjet.emlakjetyonetim.models;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.validation.constraints.Email;

public class CreateOfficeRequest {

    @NotNull
    private String firstName;

    @NotNull
    private String surname;

    @NotNull
    private String officeName;

    @Email
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
