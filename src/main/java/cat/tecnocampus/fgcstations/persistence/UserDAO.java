package cat.tecnocampus.fgcstations.persistence;

import cat.tecnocampus.fgcstations.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDAO extends JpaRepository<UserDAO, String> {
    User findByUsername(String username);

    List<User> getUsers();

    boolean existsUser(String username);
}
