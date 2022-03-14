package warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import warehouse.entity.Currency;

import java.util.List;
@RepositoryRestResource(path = "currency")
public interface CurrencyRepository extends JpaRepository<Currency,Integer> {
    @Query("select c from Currency  c where c.active=true order by c.name")
    List<Currency>getOnlyActive();
}
