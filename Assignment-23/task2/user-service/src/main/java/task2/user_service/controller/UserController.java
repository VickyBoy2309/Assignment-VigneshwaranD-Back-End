package task2.user_service.controller;

import task2.user_service.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id) {

        return new User(id, "Vicky");
    }
}