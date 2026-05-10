package task3.task3.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import task3.task3.entity.User;
import task3.task3.repository.UserRepository;

@RestController
public class UserController {

  @Autowired
  UserRepository repo;

  @GetMapping("/users/{id}")
  public Optional<User> getUserBy(@PathVariable int id) {

    return repo.findById(id);
  }
}