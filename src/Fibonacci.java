
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n, a, b, fibo;
        System.out.print("Enter a number : ");
        n = in.nextInt();

        a = 0;
        b = 1;

        for (int i = 0; i < n; i++) {
            System.out.println(" " + a);
            fibo = a + b;
            a = b;
            b = fibo;
        }
    }
}
