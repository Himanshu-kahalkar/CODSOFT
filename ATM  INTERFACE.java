import java.util.*;

class ATM {
    int Balance = 10000; 
    int Pin = 2804;
    Scanner sc = new Scanner(System.in); 

    public void checkPin() {
        System.out.println("Enter your PIN:");
        int n = sc.nextInt();
        System.out.println("Pin is: " + n);
        if (n == Pin) {
            menu();
        } else {
            System.out.println("Please enter a valid PIN");
            checkPin(); 
        }
    }

    public void menu() {
        int opt;
        do {
            System.out.println("\nEnter your choice:");
            System.out.println("1. Check Account Balance");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Exit");

            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM!");
                    break;
                default:
                    System.out.println("Enter a valid choice:");
            }
        } while (opt != 4);
    }

    public void checkBalance() {
        System.out.println("Balance: " + Balance);
    }

    public void withdraw() {
        System.out.println("Enter Amount to Withdraw:");
        int amount = sc.nextInt();
        System.out.println("Amount to Withdraw: " + amount);
        if (amount > Balance) {
            System.out.println("Insufficient Balance");
        } else {
            Balance -= amount;
            System.out.println("Money Withdrawn Successfully");
            System.out.println("Remaining Balance: " + Balance);
        }
    }

    public void deposit() {
        System.out.println("Enter Amount to Deposit:");
        int money = sc.nextInt();
        Balance += money;
        System.out.println("Money Deposited: " + money);
        System.out.println("Money Deposited Successfully");
        System.out.println("Total Balance: " + Balance);
    }

    public static void main(String args[]) {
        ATM obj = new ATM();
        obj.checkPin();
    }
}
