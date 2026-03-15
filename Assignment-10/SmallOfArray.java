//Task - 5

public class SmallOfArray {

  public static void main(String[] args) {
   
    int[] num = {10,20,30,40,50};
    int smallest = num[0];

    for (int i = 1; i < num.length; i++) {
      if (num[i] < smallest) {
        smallest = num[i];
      }
    }

    System.out.println("Smallest element in the array:" + smallest);
  }
}