package cat.itacademy.s04.t01.userapi.services;

import cat.itacademy.s04.t01.userapi.models.User;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserService {
    User create(User user);
    List<User> findAll();
    Optional<User> findById(UUID id);
    List<User> findByName(String name);
}