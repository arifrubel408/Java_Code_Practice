package home_practice_group;

import java.util.Scanner;

public class PalinedromNumber {

    public static int palindromNumber(int num) {
        int sum = 0;

        while (num != 0) {
            int remainder = num % 10;
            sum = sum * 10 + remainder;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = scanner.nextInt();
        int p = palindromNumber(num);

        if (num == p) {
            System.out.println("Palindrom Number");
        } else {
            System.out.println(" Not Palindrom Number");
        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a Number: ");
//        int number = scanner.nextInt();
//
//        int sum = 0;
//
//        while (number != 0) {
//            int remainder = number % 10;
//            sum = sum * 10 + remainder;
//            number = number / 10;
//        }
//        System.out.println("plindrom = " + sum);
//
//        if (sum != number) {
//            System.out.println("Palindrom Number");
//        } else {
//            System.out.println(" Not Palindrom Number");
//        }
//        System.out.println("");
    }
}
