// Task - 5

class Trans {

  void calFare() {
    System.out.println("Calculating Transport Fare...");
  }
}

class Bus extends Trans {

  @Override
  void calFare() {
    System.out.println("Bus Fare : ₹50 Per Passenger");
  }
}

class Train extends Trans {

  @Override
  void calFare() {
    System.out.println("Train Fare : ₹120 Per Passenger");
  }
}

class Taxi extends Trans {

  @Override
  void calFare() {
    System.out.println("Taxi  Fare : ₹12 Per km");
  }
}

public class TransFareSys {
  public static void main(String[] args) {
    Trans t;

    t = new Bus();
    t.calFare();

    t = new Train();
    t.calFare();

    t = new Taxi();
    t.calFare();
  }
}