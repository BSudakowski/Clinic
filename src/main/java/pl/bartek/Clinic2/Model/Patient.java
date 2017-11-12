package pl.bartek.Clinic2.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
    public class Patient implements Serializable {
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)



        private Long id;
        private String name;
        private String surname;
        private String email;

//    @OneToMany(fetch = FetchType.EAGER,mappedBy = "patient")
//    private List<Patient> patients;

//    public Patient(String name, String surname, String email, List<Patient> patients) {
//        this.name = name;
//        this.surname = surname;
//        this.email = email;
//        this.patients = patients;
//    }


    public Patient() {
        }

        public Patient(String name, String surname, String email) {
            this.name = name;
            this.surname = surname;
            this.email = email;
        }

//    public List<Patient> getPatients(){
//        return patients ;
//    }
//
//    public void setPatients(List<Patient> patients){
//        this.patients=patients;
//    }

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

//    @Override
//    public String toString() {
//        return "Patient{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", email='" + email + '\'' +
//                ", patients=" + patients +
////                '}';
//    }


    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
