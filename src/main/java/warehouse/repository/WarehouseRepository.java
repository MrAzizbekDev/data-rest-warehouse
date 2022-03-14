package warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import warehouse.entity.Warehouse;

import java.util.List;

@RepositoryRestResource(path = "warehouse")
public interface WarehouseRepository extends JpaRepository<Warehouse,Integer> {
    @Query("select w from Warehouse w where w.active=true order by w.name" )
    List<Warehouse>getOnlyActive();
}
