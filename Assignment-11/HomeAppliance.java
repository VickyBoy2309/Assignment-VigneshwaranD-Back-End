//Task - 1

abstract class Appliance {

  abstract void turnOn();

  abstract void turnOff();
}

class Fan extends Appliance {

  @Override
  void turnOn() {
    System.out.println("Fan is now ON ");
  }

  @Override
  void turnOff() {
    System.out.println("Fan is now OFF ");
  }
}

class WashingMachine extends Appliance {

  @Override
  void turnOn() {
    System.out.println("Washing Machine is starting ");
  }

  @Override
  void turnOff() {
    System.out.println("Washing Machine is stopped");
  }
}

public class HomeAppliance {

  public static void main(String[] args) {

    Appliance fan = new Fan();
    Appliance wm = new WashingMachine();

    fan.turnOn();
    fan.turnOff();

    wm.turnOn();
    wm.turnOff();
  }
}