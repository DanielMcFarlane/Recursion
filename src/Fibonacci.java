import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
        return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = sc.nextInt();

        System.out.println("The fibonacci number for " + input + " is " + fibonacci(input));
    }
}
