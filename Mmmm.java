import java.util.Scanner;

public class SquareRootException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input from user
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            // Check for negative number
            if (num < 0) {
                throw new ArithmeticException("Cannot find square root of a negative number");
            }

            // Calculate square root
            double result = Math.sqrt(num);
            System.out.println("Square root: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        sc.close();
    }
}
