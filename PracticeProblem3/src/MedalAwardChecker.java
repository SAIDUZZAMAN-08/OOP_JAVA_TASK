import java.util.Scanner;

public class MedalAwardChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your letter grade (GPA): ");
        double grade = scanner.nextDouble();

        
        if (grade >= 3.5) {
                System.out.println("Congratulations! You will receive a medal.");
            } else {
                System.out.println("You have a good grade, but you didn't complete the semester. No medal.");
            }


        scanner.close();
    }
}
