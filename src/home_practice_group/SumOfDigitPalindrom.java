
package home_practice_group;

import java.util.Scanner;


public class SumOfDigitPalindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = scanner.nextInt();
        int sum = 0;
        int temp = number;
        while(temp != 0){
            int remainder = temp % 10;
            sum = sum + remainder;
            temp = temp / 10;
        }
        System.out.println("Sum of Digit Of the Input Number: "+sum);
        System.out.println(" ");
    }
}
