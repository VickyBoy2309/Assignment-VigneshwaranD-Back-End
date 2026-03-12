//Task - 1

import java.util.Scanner;

public class CountDigi {
  public static void main(String[] args) {

    Scanner xo = new Scanner(System.in);

    System.out.println("Enter a number : ");
    int number = xo.nextInt();

    int count = 0;

    if (number < 0) {
      number = -number;
    }

    if (number == 0) {
      count = 1;
    } else {
      while (number > 0) {
        number = number / 10;
        count++;
      }
    }

    System.out.println("Number of Digits = " + count);

    xo.close();
  }
}