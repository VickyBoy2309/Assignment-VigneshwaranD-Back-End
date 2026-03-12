//Task - 2

import java.util.Scanner;

public class LargeOfThree {

  public static void main(String[] args) {

    Scanner xx = new Scanner(System.in);

    System.out.println("Enter First Number : ");
    double num1 = xx.nextDouble(); 

    System.out.println("Enter Second Number : ");
    double num2 = xx.nextDouble();

    System.out.println("Enter Third Number : ");
    double num3 = xx.nextDouble();

    if (num1 >= num2 && num1 >= num3) {
      System.out.println("Largest Number is : " + num1);
    } else if (num2 >= num1 && num2 >= num3) {
      System.out.println("Largest Number is : " + num2);
    } else {
      System.out.println("Largest Number is : " + num3);
    }

    xx.close();

  }
}