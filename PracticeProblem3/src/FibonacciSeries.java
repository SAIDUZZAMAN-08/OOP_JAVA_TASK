public class FibonacciSeries {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1;
        int next;

        System.out.print("Fibonacci series: " + n1 + ", " + n2);

        for (int i = 3; i <= 12; i++) {
            next = n1 + n2;
            System.out.print(", " + next);
            n1 = n2;
            n2 = next;
        }
    }
}
