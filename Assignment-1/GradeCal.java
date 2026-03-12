//Task - 2

public class GradeCal {

  public static void main(String[] args) {

    int marks = 98;
    char grade;

    //Conditional block
    if (marks  >= 90) {
      grade = 'A' ;
    }
    else if (marks >= 75) {
      grade = 'B' ;
    }
    else if (marks >= 60) {
      grade = 'C' ;
    }
    else if (marks >= 50) {
      grade = 'D' ;
    }
    else {
      grade = 'F' ;
    }

    System.out.println("Marks : " + marks);
    System.out.println("Grade : " + grade);
  }
}