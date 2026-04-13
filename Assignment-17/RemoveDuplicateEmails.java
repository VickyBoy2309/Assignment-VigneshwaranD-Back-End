//Task - 1

import java.util.*;

public class RemoveDuplicateEmails {

  public static void main(String[] args) {

    Scanner rde = new Scanner(System.in);

    List<String> emails = new ArrayList<> ();

    System.out.println("Enter the size of the emails list: ");
    int n = rde.nextInt();
    rde.nextLine();

    for (int i = 0; i < n; i++) {
      System.out.println("Enter the " + (i + 1) + " email id: ");
      String email = rde.nextLine();
      emails.add(email);
    }

    for (int i = 0; i < emails.size(); i++) {
      for (int j = i + 1; j < emails.size(); j++) {
        if (emails.get(i).equals(emails.get(j))) {
          emails.remove(j);
          j--;
        } 
      }
    }

    System.out.println("Unique email IDs:");
    for (String email : emails) {
      System.out.println(email);
    }

    rde.close();
  }
}