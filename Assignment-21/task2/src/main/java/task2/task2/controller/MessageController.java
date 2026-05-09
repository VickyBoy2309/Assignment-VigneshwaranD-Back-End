package task2.task2.controller;

import task2.task2.service.MessageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController { 

  @Autowired
  private MessageService messageService;

  @GetMapping("/message")
  public String showMessage() {
    return messageService.getMessage();
  }
}