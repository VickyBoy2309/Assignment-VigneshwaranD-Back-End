//Task - 2

public class StringCompression {

  public static String compress(String str) {

    StringBuilder result = new StringBuilder();

    int count = 1;

    for (int i = 0; i < str.length(); i++) {

      while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
        count++;
        i++;
      }

      result.append(str.charAt(i)).append(count);
      count = 1;
    }
    return result.toString();
  }
  public static void main(String[] args) {

    String input = "aaabbccccd";
    String output = compress(input);
    System.out.println("Compressed String: " + output);
  }
}