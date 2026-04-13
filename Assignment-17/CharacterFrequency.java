//Task - 3

import java.util.*;

public class CharacterFrequency {

  public static void main(String[] args) {

    String str = "aabbc";

    Map<Character, Integer> freq = new HashMap<> ();

    for (char ch : str.toCharArray()) {
      if (freq.containsKey(ch)) {
        freq.put(ch, freq.get(ch) + 1);
      } else {
        freq.put(ch, 1);
      }
    }

    System.out.println("Character Frequency: " + freq);
  }
}