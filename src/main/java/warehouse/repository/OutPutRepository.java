package warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import warehouse.entity.Output;
@RepositoryRestResource(path = "output")
public interface OutPutRepository extends JpaRepository<Output,Integer> {
}
