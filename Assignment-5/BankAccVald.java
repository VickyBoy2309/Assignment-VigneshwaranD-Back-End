//Task - 2

class BankAcc {

  long accNum;
  String accHolderName;
  double balance;

  BankAcc(long accNo, String name, double initialBalance) {
    accNum = accNo;
    accHolderName = name;
    balance = initialBalance;
  }
 
  void deposit(double amount) {
    if (amount <= 0) {
      System.out.println("Invalid Deposit Amount.");
      return;
    }

    balance += amount;
    System.out.println("Deposit Successful : " + amount);
  }

  void withdraw(double amount) {
    if (amount <= 0) {
      System.out.println("Invalid Withdrawal Amount.");
    } else if (amount > balance) {
      System.out.println("Insufficient Balance.");
    } else {
      balance -= amount;
      System.out.println("Withdrawal Successful : " + amount);
    }
  }

  void displayBalance() {
    System.out.println("Account Number : " + accNum);
    System.out.println("Account Holder : " + accHolderName);
    System.out.println("Current Balance : " + balance);
  }
}

public class BankAccVald {
  public static void main (String[] args) {

    BankAcc acc1 = new BankAcc(1, "Vicky", 50000);
    BankAcc acc2 = new BankAcc(2, "Stark", 5000000);

    acc1.deposit(10000);
    acc1.withdraw(20000);
    acc1.withdraw(50000);
    acc1.displayBalance();

    acc2.deposit(5000);
    acc2.withdraw(10000);
    acc2.displayBalance();
  }
}