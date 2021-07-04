package org.example.dsd.entities;

import javax.persistence.*;

@Entity
@Table(name = "email")
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "address")
    private String address;

    @Column(name = "isPreferred")
    private  Boolean isPreferred;


    public Email() {
    }

    public Email(String address, Boolean isPreferred) {
        this.address = address;
        this.isPreferred = isPreferred;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getPreferred() {
        return isPreferred;
    }

    public void setPreferred(Boolean preferred) {
        isPreferred = preferred;
    }
}
