package pl.bartek.Clinic2.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Patient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)


    private Long id;
    private String name;
    private String surname;
    private String email;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "patient")
    private List<Visit> visits;


    public Patient() {
    }

    public Patient(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public List<Visit> getVisits() {
        return visits;
    }

    public void setVisits(List<Visit> visits) {
        this.visits = visits;
    }

    public Patient(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return name + " " + surname + " - " + email;
    }
}
