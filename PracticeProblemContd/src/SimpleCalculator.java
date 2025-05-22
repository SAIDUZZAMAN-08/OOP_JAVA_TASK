import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        int a = scan.nextInt();


        System.out.print("Enter the second number: ");
        int b = scan.nextInt();

        System.out.print("Enter an operator (+, -, *, /): ");
        char ch = scan.next().charAt(0);

        if (ch == '+') {
            System.out.println("Result: " + (a + b));
        } else if (ch == '-') {
            System.out.println("Result: " + (a - b));
        } else if (ch == '*') {
            System.out.println("Result: " + (a * b));
        } else if (ch == '/') {
            if (b != 0) {
                System.out.println("Result: " + (a / b));
            } else {
                System.out.println("Error: Cannot divide by zero.");
            }
        } else {
            System.out.println("Invalid operator. Please use +, -, *, or /.");
        }

        scan.close();
    }
}
