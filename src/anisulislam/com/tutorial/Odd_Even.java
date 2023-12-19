
package anisulislam.com.tutorial;

import java.util.Scanner;


public class Odd_Even {
     public static void main(String[] args) {
        Scanner arif = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = arif.nextInt();
        if (num%2== 0) {
            System.out.print("Even");

        } else {
            System.out.println("Odd");
        }
        
  }
}
