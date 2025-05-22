import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");


            int score = scanner.nextInt();

            if (score < 0 || score > 100) {
                System.out.println("Invalid score. Please enter a number between 0 and 100.");
            } else if (score <= 39) {
                System.out.println("Grade: F");
            } else if (score <= 59) {
                System.out.println("Grade: C+");
            } else if (score <= 69) {
                System.out.println("Grade: B");
            } else if (score <= 79) {
                System.out.println("Grade: A-");
            } else if (score <= 89) {
                System.out.println("Grade: A");
            } else {
                System.out.println("Grade: A+");
            }


        scanner.close();
    }
}
