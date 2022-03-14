package warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import warehouse.entity.Supplier;

import java.util.List;

@RepositoryRestResource(path = "supplier")
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
    @Query("select s from Supplier  s where s.active=true order by s.name")
    List<Supplier>getOnlyActive();
}
