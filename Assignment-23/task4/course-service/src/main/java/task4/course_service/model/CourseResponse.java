package task4.course_service.model;

public class CourseResponse {

  private String courseName;
  private Student student;

  public CourseResponse(
      String courseName,
      Student student) {
    this.courseName = courseName;
    this.student = student;
  }

  public String getCourseName() {
    return courseName;
  }

  public Student getStudent() {
    return student;
  }
}