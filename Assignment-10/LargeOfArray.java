//Task - 4

public class LargeOfArray {

  public static void main(String[] args) {

    int[] num = {10,20,30,40,50};

    int largest = num[0];

    for (int i = 1; i < num.length; i++) {
      if (num[i] > largest) {
        largest = num[i];
      }
    }

    System.out.println("Largest element in the array:" + largest);
  }
}