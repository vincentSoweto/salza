package com.salza.Admin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Admin")
public class Administrator {
    @Id
    @Column(name = "id", nullable = false, unique = true
    )
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
