package kaketom.app.controllers;

import kaketom.app.models.User;
import kaketom.app.models.UserLogin;
import kaketom.app.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    @PostMapping("/create-account")
    public User createUser(@RequestBody UserLogin userLogin) {
        User newUser = new User(userLogin.getName(), userLogin.getPassword());
        return userRepository.save(newUser);
    }
}
