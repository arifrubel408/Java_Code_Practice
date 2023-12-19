
import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1, n2, rem;
        System.out.println("Enter N1 :");
        n1 = sc.nextInt();
        System.out.println("Enter N2 :");
        n2 = sc.nextInt();

        while (n2 != 0) {
            rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        System.out.println("GCD is =" + n1);

        System.out.println("-------------------");

        int num1, num2, large, i;

        System.out.println("Enter Num1 :");
        num1 = sc.nextInt();
        System.out.println("Enter Num2 :");
        num2 = sc.nextInt();

        large = num1 > num2 ? num1 : num2;

        int multiply = num1 * num2;
        for (i = large; i <= multiply; i += large) {
            if (i % num1 == 0 && i % num2 == 0) {
                break;
            }
        }
        System.out.println("LCM is = " + i);
    }

}
