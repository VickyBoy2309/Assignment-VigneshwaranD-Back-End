//Task - 2

abstract class Food {

  abstract void prepare();
}

class Pizza extends Food {

  @Override
  void prepare() {
    System.out.println("Preparing Pizza ");
    System.out.println("1. Making Dough");
    System.out.println("2. Adding sauce and toppings");
    System.out.println("3. Baking in oven");
  }
}

class Burger extends Food {

  @Override
  void prepare() {
    System.out.println("Preparing Burger ");
    System.out.println("1. Grilling Patty ");
    System.out.println("2. Adding vegetables and sauces");
    System.out.println("3. Assembling bun and patty");
  }
}

public class JunkFood {

  public static void main(String[] args) {

    Food pizza = new Pizza();
    Food burger = new Burger();

    pizza.prepare();
    System.out.println();

    burger.prepare();
  }
}