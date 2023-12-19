
package anisulislam.com.tutorial;

import java.util.Scanner;


public class Celcious_to_Farenheit {
    public static void main(String[] args) {
        
    Scanner arif = new Scanner (System.in);
    
    double celcious, farenheit;
    
        System.out.print(" Enter a no: for celcious ");
        celcious = arif.nextDouble();
        
        double a =9;
        double b =5;
        double x = a/b;
        System.out.println("Value of x is = "+x);
        
        
        System.out.println(" ");
        
        farenheit =(x*celcious+32);       // f=9/5*celcious+32
        System.out.println("Farenhiiieit = "+ farenheit);
    }
}
