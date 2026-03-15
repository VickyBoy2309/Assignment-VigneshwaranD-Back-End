//Task - 2

interface Vehicle {

  void startEngine();

  void stopEngine();
}

class Car implements Vehicle {

  @Override
  public void startEngine() {
    System.out.println("Car Engine Started With Key Ignition.");
  }

  @Override
  public void stopEngine() {
    System.out.println("Car Engine Stopped");
  }
}

class Bike implements Vehicle {

  @Override
  public void startEngine() {
    System.out.println("Bike Engine Started With Self Start");
  }

  @Override
  public void stopEngine() {
    System.out.println("Bike Engine Stopped");
  }
}

class Truck implements Vehicle {

  @Override
  public void startEngine() {
    System.out.println("Truck Engine started with heavy ignition system");
  }

  @Override
  public void stopEngine() {
    System.out.println("Truck Engine Stopped");
  }
}

public class Transport {

  public static void main(String[] args) {

    Vehicle v;

    v = new Car();
    v.startEngine();
    v.stopEngine();

    v = new Bike();
    v.startEngine();
    v.stopEngine();

    v = new Truck();
    v.startEngine();
    v.stopEngine();
  }
}