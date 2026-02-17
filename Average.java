import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st element: ");
        int a = sc.nextInt();

        System.out.print("Enter the 2nd element: ");
        int b = sc.nextInt();

        System.out.print("Enter the 3rd element: ");
        int c = sc.nextInt();

        int sum = a + b + c;
        double average = (double) sum / 3;

        System.out.println("Average of three numbers: " + average);

        sc.close();
    }
}