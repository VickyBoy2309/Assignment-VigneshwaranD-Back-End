// Task - 5

import java.util.Scanner;

public class CheckValue {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number: ");
		int number = sc.nextInt();

		CheckValue obj = new CheckValue();

		int result = obj.numberCheck(number);

		if (result != -1) {
			System.out.println("The value is: " + result);
		} else {
			System.out.println("Please enter a positive number.");
		}

		sc.close();
	}

	public int numberCheck(int number) {

		int value = -1;

		if (number > 0) {
			value = number * 2;
		}

		return value;
	}
}