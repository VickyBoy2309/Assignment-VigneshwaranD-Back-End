//Task - 3

import java.util.Scanner;
public class NumberIncreasingPyramid {
  
  public static void main(String[] args) {

    Scanner ni = new Scanner(System.in);

    System.out.print("Enter number of rows: ");
    int n = ni.nextInt();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
    ni.close();
  }
}