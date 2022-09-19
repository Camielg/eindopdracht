package nl.novi.eindopdrachtcamelcraft.repositories;

import nl.novi.eindopdrachtcamelcraft.model.Information;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InformationRepository extends CrudRepository<Information, Long> {
}
