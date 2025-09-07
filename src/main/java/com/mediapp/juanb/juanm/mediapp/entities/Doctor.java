package com.mediapp.juanb.juanm.mediapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "doctores")
public class Doctor extends User {

    @OneToOne(mappedBy = "doctor")
    @JoinColumn(name = "cedula_doctor")
    private User user;

    public Doctor() {
        super();
    }

    public Doctor(User user) {
        this.user = user;
    } 

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
