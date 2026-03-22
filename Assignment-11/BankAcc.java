//Task - 4

abstract class Acc {

  double balance;

  Acc(double balance) {
    this.balance = balance;
  }
  
  abstract void calInt();
}

class SavingAcc extends Acc {

  double intRate = 0.04;

  SavingAcc(double balance) {
    super(balance);
  }

  @Override
  void calInt() {
    double intR = balance * intRate;
    System.out.println("Savings Account Interest: " + intR);
  }
}

class CurAcc extends Acc {

  double intRate = 0.01;

  CurAcc(double balance) {
    super(balance);
  }

  @Override
  void calInt() {
    double intR = balance * intRate;
    System.out.println("Current Account Interest: " + intR);
  }
}

public class BankAcc {

  public static void main(String[] args) {

    Acc acc1= new SavingAcc(10000);
    Acc acc2 = new CurAcc(10000);

    acc1.calInt();
    acc2.calInt();
  }
}