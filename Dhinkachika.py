import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number (string): ");
            String str = sc.nextLine();

            int num = Integer.parseInt(str);

            System.out.println("Converted integer: " + num);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Cannot convert to integer.");
        }

        sc.close();
    }
}
