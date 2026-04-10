//Task - 3

import java.util.Scanner;

public class StudentGradingSystem {

  static class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
      super(message);
    }
  }

  static class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
      super(message);
    }
  }

  public static void calculateGrade(String name, int marks)
  throws InvalidMarksException, InvalidNameException {

    try {
        if (name == null || name.trim().isEmpty()) {
          throw new InvalidNameException("Student name cannot be null or empty.");
        }
        if (marks < 0 || marks >100) {
          throw new InvalidMarksException("Marks Must be between 0 to 100.");
        }

        String grade;

        if (marks >= 90) grade = "A";
        else if (marks >= 75) grade = "B";
        else if (marks >= 60) grade = "C";
        else if (marks >= 50) grade = "D";
        else grade = "F";

        System.out.println("Student: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    } finally {
      System.out.println("Process Completed");
    }
  }

  public static void main(String[] args) {

    Scanner sgs = new Scanner(System.in);

    try{
      System.out.println("Enter Student Name: ");
      String name = sgs.nextLine();

      System.out.println("Enter Marks: ");
      int marks = sgs.nextInt();

      calculateGrade(name, marks);
    } catch (InvalidMarksException | InvalidNameException e) {
      System.out.println("Error: " + e.getMessage());
    }
    sgs.close();
  }
}