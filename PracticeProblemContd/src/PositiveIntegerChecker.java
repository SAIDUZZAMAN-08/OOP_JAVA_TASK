import java.util.Scanner;

public class PositiveIntegerChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");


            int number = scanner.nextInt();
            if (number > 0) {
                System.out.println("The input is a positive integer.");
            } else {
                System.out.println("The input is an integer, but not a positive one.");
            }

        scanner.close();
    }
}
