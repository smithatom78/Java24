package lab24;

import lab21.*;

import java.util.Scanner;

class MyCustomBank {
    private String accNo;
    private String name;
    private String accType;
    private long balance;
    private Scanner sc = new Scanner(System.in);

    // Method to open a new account
    public void openAccount() {
        System.out.print("Enter Account No: ");
        accNo = sc.nextLine();
        System.out.print("Enter Account Type: ");
        accType = sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        balance = sc.nextLong();
        sc.nextLine(); // Consume the newline
        System.out.println("Account created successfully!");
    }

    // Method to display account details
    public void showAccount() {
        System.out.println("Name of Account Holder: " + name);
        System.out.println("Account No.: " + accNo);
        System.out.println("Account Type: " + accType);
        System.out.println("Balance: " + balance);
    }

    // Method to deposit money
    public void deposit() {
        System.out.print("Enter amount to deposit: ");
        long amount = sc.nextLong();
        try {
            if (amount <= 0) {
                throw new InvalidAmountException("Invalid amount; must be greater than 0.");
            }
            balance += amount;
            System.out.println("Deposit successful! New balance: " + balance);
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method to withdraw money
    public void withdrawal() {
        System.out.print("Enter amount to withdraw: ");
        long amount = sc.nextLong();
        try {
            if (amount <= 0) {
                throw new InvalidAmountException("Invalid amount; must be greater than 0.");
            }
            if (balance < amount) {
                throw new InsufficientFundsException("Insufficient balance for withdrawal.");
            }
            balance -= amount;
            System.out.println("Withdrawal successful! New balance: " + balance);
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method to search an account by account number
    public boolean search(String accNo) {
        if (this.accNo != null && this.accNo.equals(accNo)) {
            showAccount();
            return true;
        }
        return false;
    }

    // Method to check if an account exists
    public boolean exists() {
        return accNo != null;
    }
}

public class MyBankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyCustomBank customer = new MyCustomBank();
        
        int choice;
        do {
            System.out.println("\n*** Banking System Application ***");
            System.out.println("1. Open New Account");
            System.out.println("2. Display Account Details");
            System.out.println("3. Deposit Amount");
            System.out.println("4. Withdraw Amount");
            System.out.println("5. Search Account");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    customer.openAccount();
                    break;

                case 2:
                    if (customer.exists()) {
                        customer.showAccount();
                    } else {
                        System.out.println("No account exists. Please open an account first.");
                    }
                    break;

                case 3:
                    if (customer.exists()) {
                        customer.deposit();
                    } else {
                        System.out.println("No account exists. Please open an account first.");
                    }
                    break;

                case 4:
                    if (customer.exists()) {
                        customer.withdrawal();
                    } else {
                        System.out.println("No account exists. Please open an account first.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Account No to search: ");
                    String accNoSearch = sc.nextLine();
                    if (!customer.search(accNoSearch)) {
                        System.out.println("Account not found.");
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using the banking system. See you soon!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        System.out.println("\n*********************************");
        System.out.println("Thank You :) Visit again");
        System.out.println("*********************************");
    }
}
