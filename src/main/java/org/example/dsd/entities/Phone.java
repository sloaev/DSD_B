package org.example.dsd.entities;

import javax.persistence.*;

@Entity
@Table(name = "phone")
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "number")
    private Long number;

    @Column(name = "isPreferred")
    private Boolean isPreferred;

    public Phone() {
    }

    public Phone(Long number, Boolean isPreferred) {
        this.number = number;
        this.isPreferred = isPreferred;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Boolean getPreferred() {
        return isPreferred;
    }

    public void setPreferred(Boolean preferred) {
        isPreferred = preferred;
    }
}
