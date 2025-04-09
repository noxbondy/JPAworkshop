import entity.AppUser;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import repository.AppUserRepository;

@Component
public class AppCommandLineRunner implements CommandLineRunner {
AppUserRepository appUserRepository;

public AppCommandLineRunner(AppUserRepository appUserRepository) {
    this.appUserRepository = appUserRepository;
}

    @Override
    public void run(String... args) throws Exception {
    System.out.print(" hello world ");
    AppUser appUser = new AppUser("noxbondy","password");
    this.appUserRepository.save(appUser);
    System.out.print(" register user "+appUser.getId());


    }
}
