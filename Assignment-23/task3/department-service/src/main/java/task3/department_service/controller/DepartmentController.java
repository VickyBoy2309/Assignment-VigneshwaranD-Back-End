package task3.department_service.controller;

import task3.department_service.model.DepartmentResponse;
import task3.department_service.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.client.RestTemplate;

@RestController
public class DepartmentController {

  @Autowired
  private RestTemplate restTemplate;

  @GetMapping("/department/{id}")
  public DepartmentResponse getDepartment(
      @PathVariable int id) {

    String url = "http://localhost:8081/employees/" + id;

    Employee employee = restTemplate.getForObject(
        url,
        Employee.class);

    return new DepartmentResponse(
        "IT Department",
        employee);
  }
}