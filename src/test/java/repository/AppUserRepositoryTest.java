package repository;

import entity.AppUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
class AppUserRepositoryTest {

    @Autowired
    AppUserRepository appUserRepository;


    @Test
    void findByUsername() {


    }

    @Test
    void findByRegistrationDateBetween() {
    }

    @Test
    void findByDetailsId() {
    }

    @Test
    void findByDetailsEmailIgnoreCase() {
        AppUser appUser = new AppUser("abc@gmail.com", "abc123");
        appUserRepository.save(appUser);
        AppUser appUser1=appUserRepository.findByDetailsEmailIgnoreCase("abc@gmail.com");
        Assertions.assertNotNull(appUser1);


    }
}