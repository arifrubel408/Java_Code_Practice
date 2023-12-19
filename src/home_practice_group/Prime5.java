package home_practice_group;

import java.util.Scanner;

public class Prime5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m, n, count = 0, numOfPrime = 0;
        System.out.print("Enter a initial number ");
        m = in.nextInt();
        System.out.print("Enter a Final number ");
        n = in.nextInt();
        int sum = 0;
        for (int i = m; i < n; i++) {
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i);
                numOfPrime++;
                sum += i;
            }
            count = 0;
        }
        System.out.println("Total " + m + " to " + n + " Prime numbers are " + numOfPrime);
        System.out.println("Total prime sum " + sum);

        if (sum % 2 == 0) {
            System.out.println(" 2 divisor");
        } else if (sum % 3 == 0) {
            System.out.println(" 3 divisor");
        } else if (sum % 5 == 0) {
            System.out.println(" 5 divisor");
        } else {
            System.out.println("not");
        }
    }

}
