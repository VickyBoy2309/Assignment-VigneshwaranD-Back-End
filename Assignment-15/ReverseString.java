//Task - 3

import java.util.Scanner;

public class ReverseString {
 
  public static void main(String[] args) {

    Scanner rs = new Scanner(System.in);

    System.out.println("Enter a String: ");
    String input = rs.nextLine();

    String reversed = new StringBuilder(input).reverse().toString();

    System.out.println("Reversed String: " + reversed);

    rs.close();
  }
}