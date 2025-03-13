import java.util.Scanner;

public class Factorial {

    public static int fact(int n) {
        if (n >= 1) {
            return n * fact(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Factorial of " + number + " is " + fact(number));

        scanner.close();
    }
}