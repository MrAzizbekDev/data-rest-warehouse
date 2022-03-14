package warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import warehouse.entity.User;

import java.util.Optional;

@RepositoryRestResource(path = "user")
public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByEmailAndPassword(String email, String password);
     Optional<User> findByEmail(String email);
     Optional<User>findAllByEmailOrPhoneNumber(String email,String phoneNumber);
    void deleteByEmail(String email);
}

