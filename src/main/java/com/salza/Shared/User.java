package com.salza.Shared;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.swing.text.PasswordView;

@Entity(name="Users")
public class User {

    @Id
    @Column(
            name="email",
            unique = true,
            updatable = false
    )
    String email;

    @Column(
            name="password",
            updatable = true
    )
    String password;

    User(){}

    public User(String em, String pass){
    this.email = em
    ;
    this.password = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
