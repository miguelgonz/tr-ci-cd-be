package innovation.be;

import innovation.be.domain.City;
import innovation.be.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private CityRepository cityRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        cityRepository.deleteAll();

        cityRepository.save(new City("Nottingham", 0));
        cityRepository.save(new City("Paris", 1));
    }

}
