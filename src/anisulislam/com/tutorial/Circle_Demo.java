
package anisulislam.com.tutorial;

import java.util.Scanner;


public class Circle_Demo {
    public static void main(String[] args) {
        
    Scanner arif = new Scanner (System.in);
    
        double area, radious, perimeter;
    
        System.out.print(" Enter a no: for radious : ");
        radious = arif.nextDouble();
        System.out.println(" ");
        //   double a = 22;
        //   double b = 7;
        //   double pai = a/b;

        double pai= Math.PI;       // double pai = 22/7f;
           
        System.out.println("value of pai is = "+pai);
        System.out.println(" ");
        
        area = (pai *radious*radious);
        perimeter = 2*pai*radious;
        System.out.println("Area Of Circle is = "+ area);
        System.out.println("Perimeter Of Circle is = "+ perimeter);
        
        System.out.println("");
        
        System.out.println("\"Square\"");
        double square,area1,perimeter1;
        System.out.print("Enter a Square length");
        square =arif.nextDouble();
        
        area1 =square*square;
        perimeter1 = 4*square;
        System.out.println("Area of Square = "+area1);
        System.out.println("Perimeter of Square = "+perimeter1);
    }
}
