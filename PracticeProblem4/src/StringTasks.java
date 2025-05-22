import java.util.Scanner;

public class StringTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = scanner.nextLine();


        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        System.out.println("Reversed string: " + reversed);


        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("It's a palindrome.");
        } else {
            System.out.println("It's not a palindrome.");
        }

        
        System.out.print("Enter a character to count: ");
        char ch = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("Character '" + ch + "' occurred " + count + " times.");

        scanner.close();
    }
}
