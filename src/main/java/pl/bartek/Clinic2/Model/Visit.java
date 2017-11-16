package pl.bartek.Clinic2.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.sql.Time;
import java.util.Date;


@Entity
public class Visit {
    @Id
    @GeneratedValue
    private Long id;
    private String date;
    private String time;
    @OneToOne
    private Patient patient;
    @OneToOne
    private Doctor doctor;

    public Visit() {
    }

    public Visit(String date) {
        this.date = date;
    }

    public Visit(String date, String time, Patient patient, Doctor doctor) {
        this.date = date;
        this.time = time;
        this.patient = patient;
        this.doctor = doctor;
    }

    public Visit(String date, String time) {
        this.date = date;
        this.time = time;
    }

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "id=" + id +
                ", date=" + date +
                ", time=" + time +
                ", patient=" + patient +
                ", doctor=" + doctor +
                '}';
    }
}
