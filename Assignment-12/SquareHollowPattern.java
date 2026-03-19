//Task - 1

import java.util.Scanner;
public class SquareHollowPattern {
  
  public static void main(String[] args) {

    Scanner aa = new Scanner(System.in);

    System.out.println("Enter the size of square: ");
    int n = aa.nextInt();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {

        if (i == 1 || i == n || j == 1 || j == n) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
    aa.close();
  }
}
