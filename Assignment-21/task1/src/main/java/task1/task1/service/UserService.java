package task1.task1.service;

import task1.task1.model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
  
  private static Map<Integer, User> users = new HashMap<>();

  static {
    users.put(1, new User(1, "Vigneshwaran", "0987vickyboy@gmail.com"));
    users.put(2, new User(2, "Stark", "ironman@69stark.com"));
  }

  public User getUserById(int id) {
    return users.get(id);
  }
}