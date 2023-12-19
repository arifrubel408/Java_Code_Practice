package home_practice_group;

import java.util.Scanner;

/**
 *
 * @author Cloud
 */
public class MToNOddEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number :");
        int m = sc.nextInt();
        System.out.println("Enter 1st number :");
        int n = sc.nextInt();

        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
