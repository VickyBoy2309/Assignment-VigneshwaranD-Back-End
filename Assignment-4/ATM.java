//Task - 2

import java.util.Scanner;

public class ATM {
  public static void main(String[] args) {

    Scanner iq = new Scanner(System.in);

    int balance = 10000;

    System.out.println("Current Balance : " + balance);
    System.out.println("Enter Withdrawal Amount : ");
    int amount = iq.nextInt();

    if (amount > balance) {
      System.out.println("Insuffieicent Balance");
    } else if (amount <= 0) {
      System.out.println("Invaild Amount");
    } else {
      balance = balance - amount;
      System.out.println("Withdrawal Successful");
      System.out.println("Remaining Balance : " + balance);
    }

    iq.close();
  }
}