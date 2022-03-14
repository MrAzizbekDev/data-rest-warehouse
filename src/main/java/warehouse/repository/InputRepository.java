package warehouse.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import warehouse.entity.Input;

@RepositoryRestResource(path = "input")
public interface InputRepository extends JpaRepository<Input,Integer> {
    @Override
    Page<Input> findAll(Pageable pageable);

}
