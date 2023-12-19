
package home_practice_group;

import java.util.Scanner;

public class PalindromCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : "); //434 = 434 reverse number is the same of inpute number
        int num1 = scanner.nextInt();

        System.out.print("Enter a end number : "); //434 = 434 reverse number is the same of inpute number
        int num12 = scanner.nextInt();

        int count=0;
        for (int i = num1; i <= num12; i++) {
            int temp = i;
            int sum = 0;

            while (temp != 0 && i>10) {
                int r1 = temp % 10;
                sum = sum * 10 + r1;
                temp = temp / 10;
            }

            if (sum==i) {
                System.out.print(i+", ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Total palidrome number is : " + count);
        
        System.out.println(" ");
    }
}
