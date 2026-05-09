package task3.task3.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
  
  public String getGreeting() {
    return "Service Injected Successfully using @Autowired!";
  }
}