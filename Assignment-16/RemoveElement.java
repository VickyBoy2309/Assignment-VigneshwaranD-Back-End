//Task - 1

import java.util.*;

public class RemoveElement {

  public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>(
      Arrays.asList(1, 2, 3, 2, 4, 2)
    );

    int target = 2;

    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).equals(target)) {
        list.remove(i);
        i--;
      }
    }

    System.out.println(list);
  }
}