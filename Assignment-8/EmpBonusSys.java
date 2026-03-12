//Task - 3

class Emp {

  void calBonus() {
    System.out.println("Employee Bonus Calculation.");
  }
}

class Manager extends Emp {

  @Override
  void calBonus() {
    System.out.println("Manager Bonus : ₹50000");
  }
}

class Dev extends Emp {

  @Override
  void calBonus() {
    System.out.println("Developer Bonus : ₹90000");
  }
}

class Intern extends Emp {

  @Override
  void calBonus() {
    System.out.println("Intern Bonus : ₹5000");
  }
}

public class EmpBonusSys {
  public static void main(String[] args) {
   Emp empl;

    empl = new Manager();
    empl.calBonus();

    empl = new Dev();
    empl.calBonus();

    empl = new Intern();
    empl.calBonus();
  }
}