package pl.bartek.Clinic2.Repository;

import org.springframework.data.repository.CrudRepository;
import pl.bartek.Clinic2.Model.Patient;

import java.util.List;

public interface PatientRepository extends CrudRepository<Patient, Long>{
    List<Patient> findBySurname(String name);



}
