//Task - 4

public class BankAcc {
  int accountNumber;
  String accHolderName;
  double balance;

  BankAcc (int accNo, String name, double bal) {
    accountNumber = accNo;
    accHolderName = name;
    balance = bal;
  }

  void deposit(double amount) {
    balance = balance + amount;
  }

  void displayBalance() {
    System.out.println("Account Number : " + accountNumber);
    System.out.println("Account Holder Name : " + accHolderName);
    System.out.println("Current Balance : ₹" + balance);
  }

  public static void main(String[] args) {
    BankAcc acc1 = new BankAcc(101, "Vicky", 10000000 );

    acc1.deposit(90000000);
    acc1.displayBalance();
  }
}