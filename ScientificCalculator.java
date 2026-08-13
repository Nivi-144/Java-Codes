import java.util.Scanner;
public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== SCIENTIFIC CALCULATOR =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power");
            System.out.println("6. Square Root");
            System.out.println("7. Sin");
            System.out.println("8. Cos");
            System.out.println("9. Tan");
            System.out.println("10. Log (base 10)");
            System.out.println("11. Natural Log (ln)");
            System.out.println("12. Factorial");
            System.out.println("13. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            double a, b;
            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result = " + (a + b));
                    break;
                case 2:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result = " + (a - b));
                    break;
                case 3:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result = " + (a * b));
                    break;
                case 4:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    if (b == 0)
                        System.out.println("Cannot divide by zero!");
                    else
                        System.out.println("Result = " + (a / b));
                    break;
                case 5:
                    System.out.print("Enter base: ");
                    a = sc.nextDouble();
                    System.out.print("Enter exponent: ");
                    b = sc.nextDouble();
                    System.out.println("Result = " + Math.pow(a, b));
                    break;
                case 6:
                    System.out.print("Enter number: ");
                    a = sc.nextDouble();
                    if (a < 0)
                        System.out.println("Invalid input!");
                    else
                        System.out.println("Result = " + Math.sqrt(a));
                    break;
                case 7:
                    System.out.print("Enter angle in degrees: ");
                    a = sc.nextDouble();
                    System.out.println("sin(" + a + ") = "
                            + Math.sin(Math.toRadians(a)));
                    break;
                case 8:
                    System.out.print("Enter angle in degrees: ");
                    a = sc.nextDouble();
                    System.out.println("cos(" + a + ") = "
                            + Math.cos(Math.toRadians(a)));
                    break;
                case 9:
                    System.out.print("Enter angle in degrees: ");
                    a = sc.nextDouble();
                    System.out.println("tan(" + a + ") = "
                            + Math.tan(Math.toRadians(a)));
                    break;
                case 10:
                    System.out.print("Enter number: ");
                    a = sc.nextDouble();
                    if (a <= 0)
                        System.out.println("Invalid input!");
                    else
                        System.out.println("log(" + a + ") = "  + Math.log10(a));
                    break;
                case 11:
                    System.out.print("Enter number: ");
                    a = sc.nextDouble();
                    if (a <= 0)
                        System.out.println("Invalid input!");
                    else
                        System.out.println("ln(" + a + ") = "
                                + Math.log(a));
                    break;
                case 12:
                    System.out.print("Enter a positive integer: ");
                    int n = sc.nextInt();
                    if (n < 0) {
                        System.out.println("Invalid input!");
                    } else {
                        long fact = 1;

                        for (int i = 1; i <= n; i++) {
                            fact *= i;
                        }
                        System.out.println("Factorial = " + fact);
                    }
                    break;
                case 13:
                    System.out.println("Calculator closed.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
