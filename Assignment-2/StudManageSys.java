//Task - 1

import java.util.Scanner;

public class StudManageSys {

  String studentName ;
  int rollNumber ;

  public void calculatedTotalMarks() {

    Scanner ts = new Scanner(System.in);

    System.out.println("Enter marks for Sub 1 : ");
    int mark1 = ts.nextInt();

    System.out.println("Enter marks for Sub 2 : ");
    int mark2 = ts.nextInt();

    System.out.println("Enter marks for Sub 3 :");
    int mark3 = ts.nextInt();

    int totalMarks = mark1 + mark2 + mark3;

    System.out.println("Total Marks : " + totalMarks);

    ts.close();
  }

  public static void main(String[] args) {

    Scanner ts = new Scanner(System.in);

    StudManageSys s1 = new StudManageSys();

    System.out.println("Enter Student Name : ");
    s1.studentName = ts.nextLine();

    System.out.println("Enter Roll Number :" );
    s1.rollNumber = ts.nextInt();

    System.out.println("\nStudent Details : ");
    System.out.println("Name : " + s1.studentName);
    System.out.println("Roll Number : " +s1.rollNumber);

    s1.calculatedTotalMarks();

    ts.close();
  }

}