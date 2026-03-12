//Task - 3

class Student {

  int rollNo;
  String name;
  int mark1, mark2, mark3;

  Student(int rollNo, String name, int m1, int m2, int m3) {
    this.rollNo = rollNo;
    this.name = name;
    this.mark1 = m1;
    this.mark2 = m2;
    this.mark3 = m3;
  }

  void calResult() {

    int total = mark1 + mark2 + mark3;
    double avg = total / 3.0;
    String grade;

    if (avg >= 80) {
      grade = "A";
    } else if (avg >= 60) {
      grade = "B";
    } else if (avg >= 40) {
      grade = "C";
    } else {
      grade = "Fail";
    }

    System.out.println("\nRoll No : " + rollNo);
    System.out.println("Name : " + name);
    System.out.println("Marks : " + mark1 + "," + mark2 + "," + mark3);
    System.out.println("Total : " + total);
    System.out.println("Average : " + avg);
    System.out.println("Grade : " + grade);
  }
}

public class StudGrade {
  public static void main(String[] args) {

    Student s1 = new Student (1, "Vicky", 99, 99, 99);
    Student s2 = new Student (2, "Stark", 65, 76, 96);
    Student s3 = new Student (3, "Banner", 78, 77, 90);
    Student s4 = new Student (4, "Doom", 89, 78, 67);
    Student s5 = new Student (5, "Reed", 99, 99, 99);

    s1.calResult();
    s2.calResult();
    s3.calResult();
    s4.calResult();
    s5.calResult();
  }
}