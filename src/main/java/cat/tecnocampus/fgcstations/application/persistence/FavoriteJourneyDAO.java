package cat.tecnocampus.fgcstations.application.persistence;

import cat.tecnocampus.fgcstations.domain.FavoriteJourney;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FavoriteJourneyDAO extends JpaRepository<FavoriteJourney, String> {
    void saveFavoriteJourney(FavoriteJourney favoriteJourney, String username);

    List<FavoriteJourney> findFavoriteJourneys(String username);
}
