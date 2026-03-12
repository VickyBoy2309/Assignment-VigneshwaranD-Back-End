//Task - 3
import java.util.Scanner;

class Employee {
  private int employeeId ;
  private double basicSala ;

  public Employee (int employeeID, double basicSala) {
    this.employeeId = employeeID;
    this.basicSala = basicSala;
  }

  public void calculateSala() {

    double bonusAmount = basicSala * 0.10;
    double totalSala = basicSala + bonusAmount;

    System.out.println("Employee ID : " + employeeId);
    System.out.println("Basic Salary : ₹ " + basicSala);
    System.out.println("Bonus Amount : ₹ " + bonusAmount);
    System.out.println("Total Salary : ₹ " + totalSala);

  }
}

public class CalcSala {

  public static void main (String[] args) {
    Scanner ff = new Scanner(System.in);

    System.out.println("Enter Employee ID : ");
    int id = ff.nextInt();

    System.out.println("Enter Basic Salary : ");
    double salary = ff.nextDouble();

    Employee emp = new Employee(id , salary);

    emp.calculateSala();
    
    ff.close();
  }
}