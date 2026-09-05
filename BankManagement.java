import java.util.Scanner;

public class BankManagement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double balance = 0.0;
        int choice;

        do {
            System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount to deposit: ");
                double amount = scanner.nextDouble();

                if (amount > 0) {
                    balance += amount;
                    System.out.println("Amount deposited successfully.");
                } else {
                    System.out.println("Invalid amount.");
                }

            } else if (choice == 2) {
                System.out.print("Enter amount to withdraw: ");
                double amount = scanner.nextDouble();

                if (amount > 0 && amount <= balance) {
                    balance -= amount;
                    System.out.println("Amount withdrawn successfully.");
                } else {
                    System.out.println("Insufficient balance or invalid amount.");
                }

            } else if (choice == 3) {
                System.out.println("Current Balance: ₹" + balance);

            } else if (choice == 4) {
                System.out.println("Thank you for using the Bank Management System.");

            } else {
                System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
