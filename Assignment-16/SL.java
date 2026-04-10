//Task - 4

import java.util.*;

public class SL {

  public static void main(String[] args) {

    Scanner sl = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();

    int n = sl.nextInt();

    for (int i = 0; i < n; i++) {
      list.add(sl.nextInt());
    }

    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int num : list) {

      if (num > largest) {
        secondLargest = largest;
        largest = num;
      } else if (num > secondLargest && num != largest) {
        secondLargest = num;
      }
    }

    if (secondLargest == Integer.MIN_VALUE) {
      System.out.println("No second largest element");
    } else {
      System.out.println("Second Largest: " + secondLargest);
    }

    sl.close();
  }
}