package cat.tecnocampus.fgcstations.persistence;

import cat.tecnocampus.fgcstations.domain.Friends;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FriendDAO extends JpaRepository<Friends, String> {
    Friends getFriends(String username);

    List<Friends> getFriends();

    void saveFriends(Friends friends);


}
