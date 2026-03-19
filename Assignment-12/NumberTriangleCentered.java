//Task - 2

import java.util.Scanner;
public class NumberTriangleCentered {

  public static void main(String[] args) {

    Scanner nt = new Scanner(System.in);
    
    System.out.print("Enter Number of rows: ");
    int n = nt.nextInt();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
    nt.close();
  }
}