
package anisulislam.com.tutorial;

import java.util.Scanner;

public class if_else_statment {

    public static void main(String[] args) {
        Scanner arif = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = arif.nextInt();
        int validAge = 18;
        
        if (age >= 18) {
            System.out.println("Congratulations! You are a voter before "+ (age-validAge)+ " years ago" );

        } else {
            System.out.println("Sorry! You are not a valid voter. You can vote after "+(validAge-age)+" years");
        }
    }
}
