//Task - 2

import java.util.*;

public class FrequencyCount {

  public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>(
      Arrays.asList(1, 2, 2, 3, 3, 3) 
    );

    for (int i = 0; i < list.size(); i++) {

      int count = 1;

      if (list.get(i) == -1) continue;

      for (int j = i + 1; j < list.size(); j++) {
        if (list.get(i).equals(list.get(j))) {
          count++;
          list.set(j, -1);
        }
      }

      System.out.println(list.get(i) + " -> " + count);
    }
  }
}