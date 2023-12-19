
package anisulislam.com.tutorial;

import static java.lang.Math.random;
import java.util.Random;

public class Bitwise_Operator {
    public static void main(String[] args) {
        int a=32;
        int b=12;
        int c;
        
        c=a & b;
        System.out.println("Bitwise and :"+c);
        System.out.println(" ");
        int x=31;
        int y=15;
        int z;
        
        z=x & y;
        System.out.println("Bitwise and :"+z);
        
        System.out.println(" ");
        
//        int m=32;
//        int n=12;
//        int o;
//        
//        o=m | n;
//        System.out.println("Bitwise ** Or:"+o);
//        System.out.println(" ");
//        
//        int d=32;
//        int e=12;
//        int f;
//        
//        f=d ^ e;
//        System.out.println("Bitwise ** EXOR:"+f);
        System.out.println(" ");
        
        int rp1=11;
        int rq1=14;
        int rr;
        
        rr= (rp1 | rq1);
        System.out.println("Bitwise Or:"+rr);
        
        System.out.println(" ");
        
        int g=11;
        int h=14;
        int i;
        
        i=g ^ h;
        System.out.println("Bitwise EXOR:"+i);
        
        
        
       
        
        
        System.out.println(" ");
        
        
        int k=32;
        int l;
        
        l=k >> 2;
        System.out.println("Bitwise Right Shift :"+l);
        
        int s=32;
        int t;
        
        t=s << 2;
        System.out.println("Bitwise Left Shift :"+t);
        
         System.out.println("");
      
    }
    
   
}
