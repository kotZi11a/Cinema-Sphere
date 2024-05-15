package Sam.Cinema.Sphere.service;

import Sam.Cinema.Sphere.model.User;
import Sam.Cinema.Sphere.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepo userRepo;
    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    @Override
    public User addUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return userRepo.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }
}
