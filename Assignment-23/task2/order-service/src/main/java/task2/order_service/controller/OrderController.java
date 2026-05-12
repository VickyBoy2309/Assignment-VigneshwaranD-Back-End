package task2.order_service.controller;

import task2.order_service.model.OrderResponse;
import task2.order_service.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

  @Autowired
  private RestTemplate restTemplate;

  @GetMapping("/orders/{userId}")
  public OrderResponse getOrder(@PathVariable int userId) {

    String url = "http://localhost:8081/users/" + userId;

    User user = restTemplate.getForObject(url, User.class);

    return new OrderResponse(
        101,
        "Laptop",
        user);
  }
}