package com.mediapp.juanb.juanm.mediapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pacientes")
public class Patient extends User {

    @OneToOne(mappedBy = "patient")
    @JoinColumn(name = "cedula_paciente")
    private User user;

    public Patient() {
        super();
    }

    public Patient(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
