package innovation.be.repository;

import innovation.be.domain.City;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "cities")
public interface CityRepository extends MongoRepository<City, String> {

    City findByName(String name);

}
