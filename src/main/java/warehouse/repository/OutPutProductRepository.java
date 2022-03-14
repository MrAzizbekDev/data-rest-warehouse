package warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import warehouse.entity.OutputProduct;
@RepositoryRestResource(path = "outputproduct")
public interface OutPutProductRepository extends JpaRepository<OutputProduct,Integer> {
}
