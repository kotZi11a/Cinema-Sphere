package Sam.Cinema.Sphere.service;

import Sam.Cinema.Sphere.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUser();
    public User addUser(User user);
    public User getUserById(Long id);
}
