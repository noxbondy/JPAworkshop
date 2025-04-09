package repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.Assert.*;
@DataJpaTest
public class DetailsRepositoryTest {
    @Autowired
    DetailsRepository detailsRepository;

    @org.junit.Test
    public void findByEmail() {
    }

    @org.junit.Test
    public void findByNameContaining() {
    }

    @org.junit.Test
    public void findByNameIgnoreCase() {
    }
}