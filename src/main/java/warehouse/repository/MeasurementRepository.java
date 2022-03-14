package warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import warehouse.entity.Measurement;

import java.util.List;

@RepositoryRestResource(path = "measurement")
public interface MeasurementRepository extends JpaRepository<Measurement,Integer> {
   @Query("select m from Measurement m where m.active=true order by m.name")
    List<Measurement> getMeasurementForChoose();
}
