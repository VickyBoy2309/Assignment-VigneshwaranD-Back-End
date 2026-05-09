package task4.task4.component;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

  public String showMessage() {
    return "Component Annotation Working Successfully!";
  }
}