package warehouse.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import warehouse.entity.InputProduct;

@RepositoryRestResource(path = "inputproduct")
public interface InputProductRepository extends JpaRepository<InputProduct,Integer> {
    @Query("select i from InputProduct  i where i.input.id=:id")
Page<InputProduct>getInputId(Pageable pageable, @Param("id") Integer id);
}
