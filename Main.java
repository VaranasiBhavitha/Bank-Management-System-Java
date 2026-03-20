import java.util.*;
class BankAccount {
    String name;
    double balance;

    void deposit(double amount) {
    balance += amount;
    System.out.println("Deposited: " + amount);
}
}

class SavingsAccount extends BankAccount {
    void addInterest() {
        double interest = balance * 0.05;
        balance += interest;
        System.out.println("Interest: " + interest);
    }
}

class CurrentAccount extends BankAccount {
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SavingsAccount s = new SavingsAccount();
        CurrentAccount c = new CurrentAccount();

        // Create account
        System.out.print("Enter your name: ");
        String name = sc.next();

        System.out.print("Enter initial balance: ");
        double bal = sc.nextDouble();

        s.name = name;
        s.balance = bal;

        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Deposit");
            System.out.println("2. Add Interest");
            System.out.println("3. Withdraw");
            System.out.println("4. Display Balance");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    double d = sc.nextDouble();
                    s.deposit(d);
                    break;

                case 2:
                    s.addInterest();
                    break;

                case 3:
                    System.out.print("Enter amount: ");
                    double w = sc.nextDouble();
                    c.balance = s.balance; // link balance
                    c.withdraw(w);
                    s.balance = c.balance;
                    break;

                case 4:
                    System.out.println("Balance: " + s.balance);
                    break;

                case 5:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);
    }
}