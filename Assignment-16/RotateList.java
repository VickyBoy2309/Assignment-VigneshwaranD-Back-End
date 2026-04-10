//Task - 3

import java.util.*;

public class RotateList {

  public static void reverse(ArrayList<Integer> list, int start, int end) {
    while (start < end) {
      int temp = list.get(start);
      list.set(start, list.get(end));
      list.set(end, temp);
      start++;
      end--;
    }
  }

  public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>(
      Arrays.asList(1, 2, 3, 4, 5)
    );

    int k = 2;
    int n = list.size();

    k = k % n;

    reverse(list, 0, n - 1);
    reverse(list, 0 ,k - 1);
    reverse(list, k, n - 1);

    System.out.println(list);
  }
}