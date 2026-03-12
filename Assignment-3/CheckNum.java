//Task - 5

import java.util.Scanner;

public class CheckNum {
  
  public static void main(String[] args) {

    Scanner xx = new Scanner (System.in);

    System.out.println("Enter a Number : ");
    int number = xx.nextInt();

    if (number > 0) {
      System.out.println("The Number is Positive.");
    } else if (number < 0) {
      System.out.println("The Number is Negative.");
    } else {
      System.out.println("The Number is Zero.");
    }

    xx.close();
    
  }
}