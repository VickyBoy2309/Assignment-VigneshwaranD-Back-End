//Task - 2

import java.util.Scanner;

public class LoginSystem {

  // Corrected Exception
  static class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
      super(message);
    }
  }

  static class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
      super(message);
    }
  }

  private static final String Username = "vicky";
  private static final String Password = "69";

  public static void main(String[] args) {

    Scanner ls = new Scanner(System.in);
    int attempts = 0;
    boolean isLoggedIn = false;

    System.out.println("Welcome to Secure Login System");

    while (attempts < 3 && !isLoggedIn) {

      try {
        System.out.print("\nEnter Username: ");
        String inputUsername = ls.nextLine();

        if (!inputUsername.equals(Username)) {
          throw new InvalidUsernameException("Invalid Username!");
        }

        System.out.print("Enter Password: ");
        String inputPassword = ls.nextLine();

        if (!inputPassword.equals(Password)) {
          throw new InvalidPasswordException("Invalid Password!");
        }

        System.out.println("Login Successful! Welcome " + Username);
        isLoggedIn = true;

      } catch (InvalidUsernameException | InvalidPasswordException e) {
        attempts++;
        System.out.println(e.getMessage());
        System.out.println("Attempts Left: " + (3 - attempts));
      }
    }

    if (!isLoggedIn) {
      System.out.println("\nToo many failed attempts. Program Killed!");
      System.exit(0);
    }

    ls.close();
  }
}