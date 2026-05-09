package task4.task4.controller;

import task4.task4.component.MyComponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @Autowired
  private MyComponent myComponent;

  @GetMapping("/component")
  public String displayMessage() {
    return myComponent.showMessage();
  }
}