//Task - 4

import java.util.Scanner;
public class NumberDecreasingPyramid {

  public static void main(String[] args) {
    
    Scanner nd = new Scanner(System.in);

    System.out.print("Enter number of rows: ");
    int n = nd.nextInt();

    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
    nd.close();
  }
}