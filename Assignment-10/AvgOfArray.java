//Task - 3

public class AvgOfArray {

  public static void main(String[] args) {

    int[] num = { 10, 20, 30, 40, 50 };

    int sum = 0;
    double avg;

    for (int i = 0; i < num.length; i++) {
      sum += num[i];
    }

    avg = (double) sum / num.length;

    System.out.println("Average of array elements:" + avg);
  }
}