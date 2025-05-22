import java.util.Scanner;

public class Problem8_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int S = 5;
        final int N = 5;

        double[][] gp = new double[S][N];
        double[] cr = new double[N];

        System.out.println("Enter credits for 5 subjects:");
        for (int j = 0; j < N; j++) {
            System.out.print("Credit " + (j + 1) + ": ");
            cr[j] = sc.nextDouble();
        }

        for (int i = 0; i < S; i++) {
            System.out.println("\nEnter grade points for Student " + (i + 1) + ":");
            for (int j = 0; j < N; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                gp[i][j] = sc.nextDouble();
            }
        }

        System.out.println("\nCGPA for each student:");
        for (int i = 0; i < S; i++) {
            double total = 0, sumCr = 0;
            for (int j = 0; j < N; j++) {
                total += gp[i][j] * cr[j];
                sumCr += cr[j];
            }
            double cgpa = total / sumCr;
            System.out.printf("Student %d CGPA: %.2f%n", (i + 1), cgpa);
        }

        sc.close();
    }
}
