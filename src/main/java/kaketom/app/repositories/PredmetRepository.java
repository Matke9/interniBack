package kaketom.app.repositories;

import kaketom.app.models.Predmet;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PredmetRepository extends MongoRepository<Predmet, String> {
}
