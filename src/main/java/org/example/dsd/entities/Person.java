package org.example.dsd.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;


@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "fio")
    private String fio;

    @Column(name = "address")
    private String address;

    @Column(name = "birthDate")
    private Date birthDate;


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "person_id")
    private Set<Phone> phones;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "person_id")
    private Set<Email> emails;

    public Person() {
    }

    public Person(String fio, Date birthDate) {
        this.fio = fio;
        this.birthDate = birthDate;
    }

    public Person(String fio, Date birthDate, Set<Phone> phones, Set<Email> emails) {
        this.fio = fio;
        this.birthDate = birthDate;
        this.phones = phones;
        this.emails = emails;
    }

    public Person(int id, String fio, Date birthDate, Set<Phone> phones, Set<Email> emails) {
        this.id = id;
        this.fio = fio;
        this.birthDate = birthDate;
        this.phones = phones;
        this.emails = emails;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Set<Phone> getPhones() {
        return phones;
    }

    public void setPhones(Set<Phone> phones) {
        this.phones = phones;
    }

    public Set<Email> getEmails() {
        return emails;
    }

    public void setEmails(Set<Email> emails) {
        this.emails = emails;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
