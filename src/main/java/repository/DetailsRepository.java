package repository;

import entity.AppUser;
import entity.Details;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface DetailsRepository extends CrudRepository<AppUser, Integer> {

    Optional<Details> findByEmail(String email);
    List<Details> findByNameContaining(String keyword);
    List<Details> findByNameIgnoreCase(String name);


}
