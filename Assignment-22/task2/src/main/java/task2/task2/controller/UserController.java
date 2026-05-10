package task2.task2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import task2.task2.entity.User;
import task2.task2.repository.UserRepository;

@RestController
public class UserController {

  @Autowired
  UserRepository repo;

  @GetMapping("/users")
  public List<User> getAllUsers() {

    return repo.findAll();
  }
}