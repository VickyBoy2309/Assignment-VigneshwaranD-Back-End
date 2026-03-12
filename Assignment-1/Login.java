//Task - 3

//This is used to import scanner which is used for to get user input
import java.util.Scanner; //Class from the package

public class Login{

  public static void main(String[] args) {

  Scanner ff = new Scanner (System.in); //Scanner Obj

  System.out.print("Enter Username : ");
  String username = ff.nextLine();

  System.out.print("Enter Password : ");
  String password = ff.nextLine();

  String status = "Login Failed";

  if (username.equals("admin") && password.equals("1234")) {
    status = "Login Successful";
  }

  System.out.println("Login Status :" + status);

  ff.close(); //close the user input
}
}