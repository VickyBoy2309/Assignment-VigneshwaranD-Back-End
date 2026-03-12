//Task - 4

public class StockTotal {

  public static void main(String[] args) {

    int itemsInStock = 10;
    double pricePerItem = 299.99;

    double total = 0; //Initialize local var

    //Conditional block
    if (itemsInStock > 0){
      total = itemsInStock * pricePerItem;
    }

    System.out.println("Item in Stock : " + itemsInStock);
    System.out.println("Total Value : " + total);
  }
}