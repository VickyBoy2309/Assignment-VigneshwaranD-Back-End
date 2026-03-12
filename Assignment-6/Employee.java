//Task - 1

public class Employee {
  
  int empId;
  String empName;

  //Constructor
  Employee() {
    empId = 100;
    empName = "Not Assigned";
  }

  Employee(int id, String name) {
    empId = id;
    empName = name;
  }

  void displayEmployee() {
    System.out.println("Employee ID : " + empId);
    System.out.println("Employee Name : " + empName);
  }

  public static void main(String[] args) {

    Employee emp1 = new Employee();
    emp1.displayEmployee();
    
    Employee emp2 = new Employee(101, "Vicky");
    emp2.displayEmployee();
  }
}