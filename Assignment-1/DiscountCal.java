//Task - 1

public class DiscountCal {
    public static void main(String[] args) {
        double orderAmount = 6500; //Example order amount
        double discount = 0;

        //Conditional block
        if (orderAmount > 5000) {
            discount = orderAmount * 0.10; //10% Discount
        }

        double finalPrice = orderAmount - discount;
        //Printed after the coditinal block
        System.out.println("Order Amount : ₹" + orderAmount);
        System.out.println("Discount : ₹" + discount);
        System.out.println("Final Price : ₹" + finalPrice);
    }
}