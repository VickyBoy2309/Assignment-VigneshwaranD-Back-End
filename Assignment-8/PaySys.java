//Task - 1

class Payment {
  void processPay() {
    System.out.println("Processing Payment...");
  }
}

class CreditCardPay extends Payment {

  @Override
  void processPay() {
    System.out.println("Payment Processed Using Credit Card.");
  }
}

class DebitCardPayment extends Payment {

  @Override
  void processPay() {
    System.out.println("Payment Processed Using Debit Card.");
  }
}

class UPIPay extends Payment {

  @Override
  void processPay() {
    System.out.println("Payment Processed Using UPI.");
  }
}

public class PaySys {
  public static void main(String[] args) {
    Payment p;

    p = new CreditCardPay();
    p.processPay();

    p = new DebitCardPayment();
    p.processPay();

    p = new UPIPay();
    p.processPay();
  }
}