//Task - 4

import java.util.Scanner;

public class TryFinally {

  public static int processNumber(int num) {

    try {
      System.out.println("Inside try block");

      if (num % 2 == 0) {
        System.out.println("Number is Even");
        return 100;
      } else {
        System.out.println("Number is Odd");
        return 150;
      }
    } finally {
      System.out.println("Inside finally block");
      return 999;
    }
  }

  public static void main(String[] args) {

    Scanner tf = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int num = tf.nextInt();

    int result = processNumber(num);

    System.out.println("Final Returned value: " + result);

    tf.close();
  }
}