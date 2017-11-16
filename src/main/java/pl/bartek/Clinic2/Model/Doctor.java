package pl.bartek.Clinic2.Model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;

@Entity
public class Doctor implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private Long Id;
    private String name;
    private String surname;
    private String specialization;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "doctor")
    private List<Visit> visits;


    public Doctor() {
    }

    public Doctor(String name, String surname, String specialization) {
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
    }
    public List<Visit> getVisits(){
        return visits ;
    }

    public void setVisits(List<Visit> visits){
        this.visits=visits;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return name + " " + surname + " - " + specialization;
    }
}

