//Task - 2

public class ShapeCal {

  void area (int side) {
    int result = side * side;
    System.out.println("Area Of Square : " + result);
  }

  void area (int length, int width) {
    int result = length * width;
    System.out.println("Area of Rectangle : " + result);
  }

  void area(double radius) {
    double result = 3.14 * radius * radius;
    System.out.println("Area Of Circle : " + result);
  }

  public static void main(String[] args) {

    ShapeCal sc = new ShapeCal();

    sc.area(5);
    sc.area(10, 6);
    sc.area(4.5);
  }
}