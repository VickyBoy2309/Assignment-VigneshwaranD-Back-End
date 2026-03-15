//Task - 1

interface Payment {
  void processPayment(double amount);
}

class CreditCardPayment implements Payment {

  @Override
  public void processPayment(double amount) {
    System.out.println("Processing Credit Card Payment of ₹" + amount);
  }
}

class UPIPayment implements Payment {

  @Override
  public void processPayment(double amount) {
    System.out.println("Processing UPI Payment of ₹" + amount);
  }
}

class PayPalPayment implements Payment {

  @Override
  public void processPayment (double amount) {
    System.out.println("Processing PayPal Payment of ₹" + amount);
  }
}

public class PaymentType {

  public static void main (String[] args) {

    Payment creditCard = new CreditCardPayment();
    Payment upi = new UPIPayment();
    Payment paypal = new PayPalPayment();

    creditCard.processPayment(1500);
    upi.processPayment(750);
    paypal.processPayment(2000);
  }
}