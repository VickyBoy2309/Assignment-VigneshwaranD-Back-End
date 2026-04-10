//Task - 1

import java.util.Scanner;

public class BankingApp {

    static class InsufficientBalanceException extends Exception {
        public InsufficientBalanceException(String message) {
            super(message);
        }
    }

    static class InvalidAmountException extends Exception {
        public InvalidAmountException(String message) {
            super(message);
        }
    }

    static class BankAccount {
        private double balance;

        public BankAccount(double balance) {
            this.balance = balance;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) throws InvalidAmountException {
            if (amount <= 0) {
                throw new InvalidAmountException("Deposit amount must be positive.");
            }
            balance += amount;
            System.out.println("Deposit successful!");
        }

        public void withdraw(double amount)
                throws InsufficientBalanceException, InvalidAmountException {

            try {
                if (amount < 0) {
                    throw new InvalidAmountException("Amount cannot be negative.");
                }

                if (balance < amount) {
                    throw new InsufficientBalanceException("Insufficient balance.");
                }

                balance -= amount;
                System.out.println("Withdrawal successful!");

            } finally {
                System.out.println("Transaction attempted for amount: " + amount);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Simple Banking System");

        // Initial balance input
        System.out.print("Enter initial balance: ");
        double initialBalance = sc.nextDouble();

        BankAccount account = new BankAccount(initialBalance);

        int choice;

        do {
            // Menu
            System.out.println("Menu");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            try {
                switch (choice) {

                    case 1:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = sc.nextDouble();
                        account.deposit(depositAmount);
                        break;

                    case 2:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = sc.nextDouble();
                        account.withdraw(withdrawAmount);
                        break;

                    case 3:
                        System.out.println("Current Balance: " + account.getBalance());
                        break;

                    case 4:
                        System.out.println("Thank you for using the banking system!");
                        break;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }

            } catch (InvalidAmountException | InsufficientBalanceException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (choice != 4);

        sc.close();
    }
}