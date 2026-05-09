package task1.task1.controller;

import task1.task1.model.User;
import task1.task1.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping("/{id}")
  public User getUser(@PathVariable int id) {
    return userService.getUserById(id);
  }
  
}
