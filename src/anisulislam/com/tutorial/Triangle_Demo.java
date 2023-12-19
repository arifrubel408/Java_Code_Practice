
package anisulislam.com.tutorial;

import java.util.Scanner;


public class Triangle_Demo {
    public static void main(String[] args) {
        
    
    Scanner arif = new Scanner (System.in);
    
    double area, base, height,width,perimeter;
    
        System.out.print(" Enter a no: for base ");
        base = arif.nextDouble();
        System.out.print(" Enter a no: for height ");
        height = arif.nextDouble();
        System.out.print(" Enter a no: for width ");
        width = arif.nextDouble();
        
        System.out.println(" ");
        
        area = (0.5*base*height);
        perimeter =(base+height+width);
        System.out.println("Area Of Triangl is = "+ area);
        System.out.println("Rectangle perimeter is = "+perimeter);
        
        System.out.println("");
        
        
        System.out.println(" \"Rectangle\" ");
        double length,width1,areaRectangle,perimeter1;
        System.out.print("Enter a no: for length ");
        length = arif.nextDouble();
        System.out.print("Enter a no: for width ");
        width1 = arif.nextDouble();
        
        System.out.println("");
        areaRectangle =length*width1;
        perimeter1 =2*(length+width1);
        System.out.println("Rectangle area is = "+areaRectangle);
        System.out.println("Rectangle perimeter is = "+perimeter1);
        
}
}
