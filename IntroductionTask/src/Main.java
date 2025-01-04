import static java.lang.Math.sqrt;
import static java.lang.Math.PI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base of the triangle: ");
        int base = sc.nextInt();
        System.out.print("Enter height of the triangle: ");
        int height = sc.nextInt();
        System.out.println("Area of the triangle: " + calculateTriangle(base, height));

        System.out.print("Enter radius: ");
        int radius = sc.nextInt();
        System.out.println("Volume of a ball: " + calculateVolumeBall(radius));
        System.out.println("Area of a circle: " + calculateCircle(radius));

        System.out.print("Enter temperature in Celsius: ");
        float celsius = sc.nextFloat();
        System.out.println("Temperature in Fahrenheit: " + convertCelsius2Fahrenheit(celsius));

        System.out.print("Enter arm length of the equilateral triangle: ");
        int arm = sc.nextInt();
        System.out.println("Area of an equilateral triangle: " + calculateEquilateralTriangle(arm));

        System.out.print("Enter side a of the triangle: ");
        int a = sc.nextInt();
        System.out.print("Enter side b of the triangle: ");
        int b = sc.nextInt();
        System.out.print("Enter side c of the triangle: ");
        int c = sc.nextInt();
        System.out.println("Area of a triangle : " + calculateTriangle2(a, b, c));

        sc.close();
    }

    public static double calculateTriangle(int base, int height) {
        return 0.5 * base * height;
    }

    public static double calculateVolumeBall(int radius) {
        return 4 * PI * Math.pow(radius, 3) / 3;
    }

    public static double calculateCircle(int radius) {
        return PI * radius * radius;
    }

    public static double convertCelsius2Fahrenheit(float celsius) {
        return 32 + (celsius * 9 / 5);
    }

    public static double calculateEquilateralTriangle(int arm) {
        return (sqrt(3)) / 4 * arm * arm;
    }

    public static double calculateTriangle2(int a, int b, int c) {
        double s = (a + b + c) / 2.0;
        return sqrt(s * (s - a) * (s - b) * (s - c));
    }
}