//Task - 2

import java.util.Scanner;

class BankBal {

  private double balance;
  private String accHolderName;

  public BankBal(String name, double initialBalance) {
    accHolderName = name;
    balance = initialBalance;
  }

  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Deposit Successful !");
    } else {
      System.out.println("Invalid Deposite Amount !");
    }
  }

  public void withdraw(double withdrawalAmount) {

    if (withdrawalAmount <= 0) {
      System.out.println("Invaild Withdrawal amount.");
    } else if (withdrawalAmount > balance) {
      System.out.println("Withdrawal Successful !");
    }
  }

  public void checkBalance() {
    System.out.println("Current Balance : ₹" + balance);
  }

  public void displayAccInfo() {
    System.out.println("\nAccount Holder : " + accHolderName);
    System.out.println("Current Balance : ₹" + balance);
  }
}

public class BankingApp {

  public static void main(String[] args) {
    Scanner gg = new Scanner(System.in);

    System.out.println("Enter Account Holder Name : ");
    String name = gg.nextLine();

    System.out.println("Enter Initial Balance : ");
    double initialBalance = gg.nextDouble();

    BankBal account = new BankBal(name, initialBalance);

    int choice;

    do {
      System.out.println("\n==== Banking Menu =====");
      System.out.println("1. Deposit ");
      System.out.println("2. Withdraw ");
      System.out.println("3. Check Balance ");
      System.out.println("4. Display Account Info ");
      System.out.println("5. Exit ");
      System.out.println("Enter Your Choice : ");

      choice = gg.nextInt();

      if (choice == 1) {
        System.out.println("Enter Deposit Amount : ");
        double depositAmount = gg.nextDouble();
        account.deposit(depositAmount);
      } else if (choice == 2) {
        System.out.println("Enter Withdrawal Amount : ");
        double withdrawalAmount = gg.nextDouble();
        account.withdraw(withdrawalAmount);
      } else if (choice == 3) {
        account.checkBalance();
      } else if (choice == 4) {
        account.displayAccInfo();
      } else if (choice == 5) {
        System.out.println("Thank you for using the banking application .");
      } else {
        System.out.println("Invalid choice . Try again .");
      }
    } while (choice != 5);
    gg.close();
  }
}