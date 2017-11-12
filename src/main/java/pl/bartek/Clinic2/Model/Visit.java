//package pl.bartek.Clinic2.Model;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
//import java.sql.Time;
//import java.util.Date;
//@Entity
//public class Visit {
//    @Id
//    @GeneratedValue
//    private Long id;
//    private Date date;
//    private Time time;
//    @OneToOne
//    private Patient patient;
//    @OneToOne
//    private Doctor doctor;
//
//    public Visit() {
//    }
//
//    public Visit(Date date, Time time, Patient patient, Doctor doctor) {
//        this.date = date;
//        this.time = time;
//        this.patient = patient;
//        this.doctor = doctor;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }
//
//    public Time getTime() {
//        return time;
//    }
//
//    public void setTime(Time time) {
//        this.time = time;
//    }
//
//    public Patient getPatient() {
//        return patient;
//    }
//
//    public void setPatient(Patient patient) {
//        this.patient = patient;
//    }
//
//    public Doctor getDoctor() {
//        return doctor;
//    }
//
//    public void setDoctor(Doctor doctor) {
//        this.doctor = doctor;
//    }
//
//    @Override
//    public String toString() {
//        return "Visit{" +
//                "id=" + id +
//                ", date=" + date +
//                ", time=" + time +
//                ", patient=" + patient +
//                ", doctor=" + doctor +
//                '}';
//    }
//}
