package home_practice_group;

import java.util.Scanner;

public class Prime1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number ");
        int num = in.nextInt();

        int count = 0;

        for (int i = 2; i < num; i++) {
            if (num % 2 == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println(num + " is a Prime");
        } else {
            System.out.println(num + " is not a Prime");
        }
        System.out.println("");
    }
}
