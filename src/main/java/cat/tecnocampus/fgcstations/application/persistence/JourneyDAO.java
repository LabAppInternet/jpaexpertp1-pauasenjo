package cat.tecnocampus.fgcstations.application.persistence;

import cat.tecnocampus.fgcstations.domain.Journey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNullApi;

import java.util.Optional;

public interface JourneyDAO extends JpaRepository<Journey, String> {
    int saveJourney(Journey journey);

    String getJourneyId(Journey journey);
    Optional<Journey> findById(String journeyId);
}
