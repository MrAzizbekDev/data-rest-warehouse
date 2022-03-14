package warehouse.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import warehouse.entity.Category;
import java.util.List;
@RepositoryRestResource(path = "category")
public interface CategoryRepository extends JpaRepository<Category,Integer> {
   @Query(value = "select c from Category c where c.active=true order by c.name")
    List<Category>findCategoryForChoose();
}
