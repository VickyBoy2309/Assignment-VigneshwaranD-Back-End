//Task - 3

import java.util.Scanner;

public class CountDigi {

  public static void main (String[] args) {
    Scanner xx = new Scanner (System.in);

    System.out.println("Enter a number : ");
    int number =  xx.nextInt();

    int count = 0;

    if (number == 0) {
      count = 1;
    } else {
      while (number > 0) {
        number = number / 10;
        count++;
      }
    }

    System.out.println("Number of Digits : " + count);

    xx.close();
  }
}