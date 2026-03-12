//Task - 1

import java.util.Scanner;

public class LargeOfTwo {

  public static void main(String[] args) {
    Scanner xx = new Scanner(System.in);

    System.out.println("Enter First Number : ");
    double num1 = xx.nextDouble();

    System.out.println("Enter Second Number : ");
    double num2 = xx.nextDouble();

    if (num1 > num2) {
      System.out.println("Largest Number is : " + num1);
    } else if (num2 > num1) {
      System.out.println("Largest Number is : " + num2);
    } else {
      System.out.println("Both Numbers are equal.");
    }

    xx.close();
  }
}