package pl.bartek.Clinic2.Repository;

import org.springframework.data.repository.CrudRepository;
import pl.bartek.Clinic2.Model.Doctor;


import java.util.List;

public interface DoctorRepository extends CrudRepository<Doctor, Long> {
    List<Doctor> findBySurname(String name);
}
