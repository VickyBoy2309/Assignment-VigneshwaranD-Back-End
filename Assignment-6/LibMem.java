//Task - 3

public class LibMem {

  int memId;
  String memshipType;

  LibMem() {
    memId = 501;
    memshipType = "Regular";
  }

  void displayMem() {
    System.out.println("Member ID : " + memId);
    System.out.println("Member Type : " + memshipType);
  }

  public static void main(String[] args) {

    LibMem member = new LibMem();
    member.displayMem();
  }
}