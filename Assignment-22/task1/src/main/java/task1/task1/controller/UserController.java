package task1.task1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import task1.task1.entity.User;
import task1.task1.repository.UserRepository;

@RestController
public class UserController {

  @Autowired
  UserRepository repo;

  @GetMapping("/")
  public String home() {
    return "Application Running! Data shown in MySQl Successfully!";
  }

  @PostMapping("/save")
  public String saveUser(@RequestBody User user) {

    repo.save(user);

    return "User Saved Successfully!";
  }
}