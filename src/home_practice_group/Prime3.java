package home_practice_group;

import java.util.Scanner;

public class Prime3 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int num, count = 0;
        System.out.print("Enter a number ");
        num = in.nextInt();
        if (num == 0 || num == 1) {
            System.out.println("Not Prime");
        } else {
            for (int i = 2; i < num / 2; i++) {
                if (num % 2 == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
        
    }
}
