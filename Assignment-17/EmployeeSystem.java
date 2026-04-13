//Task - 4

import java.util.*;

public class EmployeeSystem {

  public static void main(String[] args) {

    Scanner es = new Scanner(System.in);

    Map<Integer, Double> empSala = new HashMap<> ();
    Set<Integer> empIds = new HashSet<> ();

    System.out.println("Enter number of employees: ");
    int n = es.nextInt();

    for (int i = 0; i < n; i++) {
      System.out.println("Enter Employee ID: ");
      int id = es.nextInt();

      System.out.println("Enter Salary: ");
      double sala = es.nextDouble();

      empSala.put(id, sala);
      empIds.add(id);
    }

    System.out.println("\nEnter ID to retrieve salary:");
    int searchId = es.nextInt();

    if (empSala.containsKey(searchId)) {
      System.out.println("Salary: " + empSala.get(searchId));
    } else {
      System.out.println("Employee ID not found ");
    }

    System.out.println("\nEnter ID to update salary: ");
    int updateId = es.nextInt();

    if (empIds.contains(updateId)) {
      System.out.println("Enter new Salary: ");
      double newSala = es.nextDouble();

      empSala.put(updateId, newSala);
      System.out.println("Salary Updated");
    } else {
      System.out.println("Employee ID not found");
    }

    System.out.println("\nEmployee Records: ");
    for (Map.Entry<Integer, Double> entry : empSala.entrySet()) {
      System.out.println("ID: " + entry.getKey() + " Salary: " + entry.getValue());
    }
    es.close();
  }
}