//Task - 2

public class Product {

  int productId;
  String productName;
  double price;
  int quantity;

  Product(int id, String name, double p, int q) {
    productId = id;
    productName = name;
    price = p;
    quantity = q;
  }

  double calTotalPrice() {
    return price * quantity;
  }

  void displayProduct() {

    System.out.println("Product ID : " + productId);
    System.out.println("Product Name : " + productName);
    System.out.println("Price : " + price);
    System.out.println("Quantity : " + quantity);
    System.out.println("Total Price : ₹" + calTotalPrice());
  }

  public static void main(String[] args) {

    Product p1 = new Product(1, "Porsche 911", 47700000, 15);
    Product p2 = new Product(2, "Koenigsegg Jesko Absolut", 660000000, 5);

    p1.displayProduct();
    p2.displayProduct();

    double grandTotal = p1.calTotalPrice() + p2.calTotalPrice();
    System.out.println("Grand Total Price : ₹" + grandTotal);
  }
}