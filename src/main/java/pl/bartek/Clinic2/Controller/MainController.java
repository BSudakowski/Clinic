package pl.bartek.Clinic2.Controller;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.bartek.Clinic2.Model.Doctor;
import pl.bartek.Clinic2.Model.Patient;
//import pl.bartek.Clinic2.Model.Visit;
import pl.bartek.Clinic2.Repository.DoctorRepository;
import pl.bartek.Clinic2.Repository.PatientRepository;
//import pl.bartek.Clinic2.Repository.VisitRepository;

import javax.print.Doc;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class MainController {
    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private DoctorRepository doctorRepository;

    @GetMapping("/")
    public String Index() {
        return "index";
    }

    @GetMapping("/doctor")
    public String DoctorSite() {
        return "doctor";
    }

    @GetMapping("/patient")
    public String PatientSite() {
        return "patient";
    }

    @GetMapping("/addpatient")
    public String addpatient() {
        return "addpatient";
    }

    @GetMapping("/add")
    public String addnewpatient(@RequestParam String name, @RequestParam String surname, @RequestParam String email, ModelMap modelMap) {
        Patient n = new Patient();
        n.setName(name);
        n.setEmail(email);
        n.setSurname(surname);
        patientRepository.save(n);
        modelMap.addAttribute("addMessage", "Pomyślnie dodano pacjęta");
        return "addpatient";
    }

    @GetMapping("/adddoc")
    public String addnewdoctor(@RequestParam String name, @RequestParam String surname, @RequestParam String specialization, ModelMap modelMap) {
        Doctor d = new Doctor();
        d.setName(name);
        d.setSpecialization(specialization);
        d.setSurname(surname);
        doctorRepository.save(d);
        modelMap.addAttribute("addMessage", "Pomyślnie dodano doktora");
        return "adddoctor";
    }

    @GetMapping("/adddoctor")
    public String Adddoctor() {
        return "adddoctor";
    }

    @GetMapping("/addvis")
    public String addvisit(ModelMap modelMap) {
        modelMap.put("doctor", doctorRepository.findAll());
        modelMap.put("patient", patientRepository.findAll());
        return "addvisit";
    }

    @GetMapping("/allpatients")
    public String allpatients(ModelMap modelMap) {
        List<Patient> patients = new ArrayList<>();
        patientRepository.findAll().forEach(p -> patients.add(p));
        modelMap.addAttribute("patients", patients);
        return "allpatients";
    }

    @GetMapping("/alldocs")
    public String alldoc(ModelMap modelMap) {
        List<Doctor> doctors = new ArrayList<>();
        doctorRepository.findAll().forEach(d -> doctors.add(d));
        modelMap.addAttribute("doctors", doctors);
        return "alldoctors";
    }

}

