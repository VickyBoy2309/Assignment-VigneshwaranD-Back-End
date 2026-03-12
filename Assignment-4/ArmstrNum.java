//Task - 3

import java.util.Scanner;

public class ArmstrNum {
  public static void main(String[] args) {
     Scanner yt = new Scanner(System.in);

     System.out.println("Enter a Number : ");
     int number = yt.nextInt();
 
     int ogNum = number;
     int sum = 0;
     int digi = 0;

     int temp = number;
     while (temp > 0) {
      temp = temp / 10;
      digi++;
     }

     temp = number;
     while (temp > 0) {
      int digit = temp % 10;
      sum += Math.pow(digit, digi);
      temp = temp / 10;
     }

     if (sum == ogNum) {
      System.out.println("Armstrong Number");
    } else {
      System.out.println("Not an Armstrong Number");
     }

     yt.close();
  }
}