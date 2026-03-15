//Task - 3

interface SmartDevice {

  void turnOn();
  void turnOff();
}

class Fan implements SmartDevice {

  @Override
  public void turnOn() {
    System.out.println("Fan is turned ON");
  }

  @Override
  public void turnOff() {
    System.out.println("Fan is turned OFF");
  }
}

class Light implements SmartDevice {

  @Override
  public void turnOn() {
    System.out.println("Light is turned ON");
  }

  @Override
  public void turnOff() {
    System.out.println("Light is turned OFF");
  }
}

class AirCond implements SmartDevice {

  @Override
  public void turnOn() {
    System.out.println("Air Conditioner is turned ON");
  }

  @Override
  public void turnOff() {
    System.out.println("Air Conditioner is turnes OFF");
  }
}

public class SmartDev {
  
  public static void main(String[] args) {

    SmartDevice sd;

    sd = new Fan();
    sd.turnOn();
    sd.turnOff();

    sd = new Light();
    sd.turnOn();
    sd.turnOff();

    sd = new AirCond();
    sd.turnOn();
    sd.turnOff();
  }
}