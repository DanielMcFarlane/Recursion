import java.util.Scanner;

public class SumOfNumbers {
    public static int calculateSum(int n){
        if (n < 10) {
            return n;
        }
        return n % 10 + calculateSum(n / 10);
    }

//    public static int calculateSum(int n) {
//        if (n >= 1) {
//            return n + calculateSum(n-1);
//        } else {
//            return 1;
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        System.out.println("The sum of digits is " + calculateSum(n));
    }
}
