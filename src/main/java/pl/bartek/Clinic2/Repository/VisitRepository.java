package pl.bartek.Clinic2.Repository;

import org.springframework.data.repository.CrudRepository;
import pl.bartek.Clinic2.Model.Visit;

import javax.xml.crypto.Data;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
