package warehouse.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import warehouse.entity.Client;

@RepositoryRestResource(path = "client")
public interface ClientRepository extends CrudRepository<Client,Integer> {

}
