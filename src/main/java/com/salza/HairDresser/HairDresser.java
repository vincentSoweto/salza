package com.salza.HairDresser;

import com.salza.Shared.User;

import javax.persistence.Entity;

@Entity(name="HairDresser")
public class HairDresser extends User {

    public HairDresser() {
        super("","");
    }

    public HairDresser(String em, String pass) {
        super(em, pass);
    }

}
