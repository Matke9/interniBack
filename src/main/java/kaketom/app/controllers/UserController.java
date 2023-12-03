package kaketom.app.controllers;

import kaketom.app.models.Predmet;
import kaketom.app.models.PredmetNovi;
import kaketom.app.models.User;
import kaketom.app.models.UserLogin;
import kaketom.app.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/add-subject")
    public User addSubject(@RequestParam String user_id, @RequestBody PredmetNovi p){
        User u = userRepository.findById(user_id).orElse(null);
        List<Predmet> predmeti = u.getPredmeti();
        predmeti.add(new Predmet(p.getName(), p.getMaterial(), p.getWebsite()));
        u = userRepository.save(u);
        return u;
    }
}
