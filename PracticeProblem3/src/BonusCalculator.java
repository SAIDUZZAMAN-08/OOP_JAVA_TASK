import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your sales achievement percentage (e.g. 95 for 95%): ");
        double sales = scanner.nextDouble();

        System.out.print("Enter your attendance percentage (e.g. 100 for 100%): ");
        double attendance = scanner.nextDouble();

        double bonus;

        if (sales >= 95) {
            if (attendance == 100) {
                bonus = 60;
            } else if (attendance == 90) {
                bonus = 40;
            } else {
                bonus = 5;
            }
        } else if (sales >= 80) {
            if (attendance == 100) {
                bonus = 40;
            } else if (attendance == 90) {
                bonus = 20;
            } else {
                bonus = 5;
            }
        } else {
            bonus = 5;
        }

        System.out.println("You will receive a " + bonus + "% bonus.");

        scanner.close();
    }
}
