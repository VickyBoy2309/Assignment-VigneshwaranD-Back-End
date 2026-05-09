package task3.task3.controller;

import task3.task3.service.GreetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

  @Autowired
  private GreetingService greetingService;

  @GetMapping("/greeting")
  public String showGreeting() {
    return greetingService.getGreeting();
  }
}