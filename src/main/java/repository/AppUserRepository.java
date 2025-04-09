package repository;

import entity.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AppUserRepository extends CrudRepository<AppUser, Integer> {


    AppUser findByUsername(String username);
    List<AppUser> findByRegistrationDateBetween(LocalDate startDate, LocalDate endDate);
    List<AppUser> findByDetailsId(Long detailsId);
    AppUser findByDetailsEmailIgnoreCase(String email);

}

