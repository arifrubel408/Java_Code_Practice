package home_practice_group;

import java.util.Scanner;

public class Prime4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m, n, count = 0;
        System.out.print("Enter a initial number ");
        m = in.nextInt();
        System.out.print("Enter a Final number ");
        n = in.nextInt();

        for (int i = m; i < n; i++) {
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(i);
            }
            count = 0;
        }
    }
}
