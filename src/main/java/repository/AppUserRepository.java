package repository;

import entity.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppUserRepository extends CrudRepository<AppUser, Integer> {


    default AppUser findByUsername(String username) {
        return null;
    }
}

