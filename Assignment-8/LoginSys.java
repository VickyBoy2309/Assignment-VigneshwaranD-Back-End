//Task - 4

import java.util.Scanner;

public class LoginSys {

  void login(String username, String password) {
    System.out.println("Login Successful Using Username and Password.");
    System.out.println("Welcome, " + username);
  }

  void login(String email, String password, int flag) {
    System.out.println("Login Successful Using Email.");
    System.out.println("welcome, " + email);
  }

  void login(long mobileNumber, int otp) {
    System.out.println("Login Successful using Mobile Number.");
    System.out.println("Mobile : " + mobileNumber);
  }

  public static void main(String[] args) {

    Scanner xx = new Scanner(System.in);
    LoginSys ls = new LoginSys();

    System.out.println("Choose Login Method : ");
    System.out.println("1. Username & Password");
    System.out.println("2. Email & Password");
    System.out.println("3. Mobile & OTP");

    int choice = xx.nextInt();
    xx.nextLine();

    switch (choice) {

      case 1:
        System.out.println("Enter Username : ");
        String username = xx.nextLine();

        System.out.println("Enter Password : ");
        String password = xx.nextLine();

        ls.login(username, password);
        break;

      case 2:
        System.out.println("Enter Email : ");
        String email = xx.nextLine();

        System.out.println("Enter Password : ");
        String pass = xx.nextLine();

        ls.login(email, pass, 1);
        break;

      case 3:
        System.out.println("Enter Mobile Number : ");
        long mobile = xx.nextLong();

        System.out.println("Enter OTP : ");
        int otp = xx.nextInt();

        ls.login(mobile, otp);
        break;

      default:
        System.out.println("Invalid Choice.");
    }
    xx.close();
  }
}