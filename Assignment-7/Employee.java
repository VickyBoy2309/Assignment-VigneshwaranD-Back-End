//Task - 1

public class Employee {

  int empId;
  String empName;
  double salary;

  Employee(int id, String name, double sala) {
    empId = id;
    empName = name;
    salary = sala;
  }

  void displayEmployee() {
    System.out.println("Employee ID : " + empId);
    System.out.println("Employee Name : " + empName);
    System.out.println("Salary : " + salary);
  }

  public static void main(String[] args) {
    Employee emp1 = new Employee(101, "Stark", 99999);
    Employee emp2 = new Employee(102, "Rogers", 80000);
    Employee emp3 = new Employee(103, "Parker", 69999);

    emp1.displayEmployee();
    emp2.displayEmployee();
    emp3.displayEmployee();
  }
}