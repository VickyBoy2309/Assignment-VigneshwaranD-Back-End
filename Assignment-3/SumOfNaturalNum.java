//Task - 4

import java.util.Scanner;

public class SumOfNaturalNum {

  public static void main(String[] args) {

    Scanner xx = new Scanner (System.in);

    System.out.println("Enter value of N : ");
    int n = xx.nextInt();

    int sum = 0;

    for (int i = 1; i <= n; i++) {
      sum = sum + i;
    }

    System.out.println("Sum of first " + n + " natural numbers is : " + sum);

    xx.close();

  }
}