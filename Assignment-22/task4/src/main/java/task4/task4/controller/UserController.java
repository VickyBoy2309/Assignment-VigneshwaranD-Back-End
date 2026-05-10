package task4.task4.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import task4.task4.entity.User;
import task4.task4.repository.UserRepository;

@RestController
public class UserController {

  @Autowired
  UserRepository repo;

  @PutMapping("/users/{id}")
  public String updateUser(@PathVariable int id,
      @RequestBody User updatedUser) {

    Optional<User> optionalUser = repo.findById(id);

    if (optionalUser.isPresent()) {

      User user = optionalUser.get();

      user.setName(updatedUser.getName());
      user.setEmail(updatedUser.getEmail());

      repo.save(user);

      return "User Updated Successfully!";
    }

    return "User Not Found!";
  }

  @DeleteMapping("/users/{id}")
  public String deleteUser(@PathVariable int id) {

    repo.deleteById(id);

    return "User Deleted Successfully!";
  }
}