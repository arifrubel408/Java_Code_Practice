package home_practice_group;

import java.util.Scanner;

public class ReverseNumberPalindrom {

    public static int reverseNumber(int number) {
        int sum = 0;

        while (number != 0) {
            int remainder = number % 10;
            sum = sum * 10 + remainder;
            number = number / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = scanner.nextInt();
        
        System.out.println("Reverse Number = "+ reverseNumber(number));
        
        System.out.println("");

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a Number: ");
//        int number = scanner.nextInt();
//        int sum = 0;
//        int temp = number;
//        while(temp != 0){
//            int remainder = temp % 10;
//            sum = sum * 10 + remainder;
//            temp = temp / 10;
//        }
//        System.out.println("Reverse Number Of the Input Number: "+sum);
//        System.out.println(" ");
    }
}
