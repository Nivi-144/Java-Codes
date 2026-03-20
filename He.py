import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 5000; // initial balance

        try {
            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();

            if (amount > balance) {
                throw new ArithmeticException("Insufficient balance.");
            }

            balance = balance - amount;
            System.out.println("Withdrawal successful.");
            System.out.println("Remaining balance: " + balance);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
