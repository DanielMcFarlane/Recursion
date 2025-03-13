import java.util.Scanner;

public class ExponentialPower {
    public static int calculatePower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * calculatePower(base, exponent - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int base = sc.nextInt();
        System.out.print("Enter an exponent: ");
        int exponent = sc.nextInt();

        System.out.println(base + " ^ " + exponent +  " = " + calculatePower(base, exponent));
    }
}