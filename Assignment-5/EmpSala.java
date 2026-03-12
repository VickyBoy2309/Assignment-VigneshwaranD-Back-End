//Task - 1

class Employee {
  int empId;
  String empName;
  double basicSala;

  Employee (int id, String name, double basic) {
    empId = id;
    empName = name;
    basicSala = basic;
  }

  void calSala() {

    double hra = 0.20 * basicSala;
    double da = 0.10 * basicSala;
    double bonus = 0;

    if (basicSala > 50000) {
      bonus = 0.05 * basicSala;
    }
    double grossSala = basicSala + hra + da + bonus;

    System.out.println("\nEmployee ID : " + empId);
    System.out.println("Emplyee Name : " + empName);
    System.out.println("Basic Salary : " + basicSala);
    System.out.println("HRA (20%) : " + hra);
    System.out.println("DA (10%%) : " + da);

    if (bonus > 0) {
      System.out.println("Bonus (5%) : " + bonus);
    }
    System.out.println("Gross Salary : " + grossSala);
  }
}

public class EmpSala {
  public static void main(String[] args) {

    Employee emp1 = new Employee (01, "VickyBoy", 99999);
    Employee emp2 = new Employee (69, "Tony Stark", 69000);
    Employee emp3 = new Employee (67, "Bruce Banner", 35000);

    emp1.calSala();
    emp2.calSala();
    emp3.calSala();
  }
}