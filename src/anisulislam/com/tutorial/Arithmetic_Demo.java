package anisulislam.com.tutorial;


import java.util.Scanner;


public class Arithmetic_Demo {
    public static void main(String[] args) {
        Scanner arif = new Scanner(System.in);
        int num1, num2, result;
        double result2;
        
        System.out.print("Enter 1st no: ");
        num1 = arif.nextInt();
        
        System.out.print("Enter 2nd no: ");
        num2 = arif.nextInt();
        
        System.out.println("");
//        num1 = 20;
//        num2= 10;
        
        result = num1 + num2;
        System.out.println("Sum = "+ result);
     
        result = num1 - num2;
        System.out.println("Subtract = "+result);
        
        
        result = num1 * num2;
        System.out.println("Product = "+result);
        
        
//        result = num1 / num2;
//        System.out.println("Div = "+result);

        result2 = (double)num1 / num2;      //type casting
        System.out.println("Div = "+result2);
        
        
        result = num1 % num2;
        System.out.println("MOd = "+result);
    }
 
}
