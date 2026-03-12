//Task - 3

public class StuGradeSys {

  int stuId;
  String stuName;
  int marks;

  StuGradeSys(int id , String name, int mark) {
    stuId = id;
    stuName = name;
    marks = mark;
  }

  String calGrade() {
    if (marks >= 90) {
      return "Grade A";
    } else if (marks >= 75) {
      return "Grade B";
    } else if (marks >= 50) {
      return "Grade C";
    } else {
      return "Fail";
    }
  }

  void displayStu() {
    System.out.println("Student ID : " + stuId);
    System.out.println("Student Name : " + stuName);
    System.out.println("Marks : " + marks);
    System.out.println("Result : " + calGrade());
  }

  public static void main(String[] args) {
    StuGradeSys s1 = new StuGradeSys(101, "Stark", 99);
    StuGradeSys s2 = new StuGradeSys(102, "Vicky", 100);

    s1.displayStu();
    s2.displayStu();
  }
}