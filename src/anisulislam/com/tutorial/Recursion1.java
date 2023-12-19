package anisulislam.com.tutorial;

import java.util.Scanner;

public class Recursion1 {

    int factorial(int num){
        if (num==1){
            return 1;
        }else{
            return num*(factorial(num-1));
        }
    } 
}

class FactTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        
        Recursion1 rec = new Recursion1();
        int result = rec.factorial(number);
        
        System.out.println("Factorial "+number+" is = "+result);
    }
}