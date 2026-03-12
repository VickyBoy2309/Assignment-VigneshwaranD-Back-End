//Task - 2

public class Phone {

  String model;
  int price;

  Phone() {
    model = "VIVO T2X 5G";
    price = 14000;
  }

  void disaplayPhone() {
    System.out.println("Phone Model : " + model);
    System.out.println("Phone Price : " + price);
  }

  public static void main(String[] args) {

    Phone p1 = new Phone();
    p1.disaplayPhone();
  }
}