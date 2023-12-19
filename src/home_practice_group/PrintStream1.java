 
package home_practice_group;

import java.io.PrintStream;

public class PrintStream1 {
    public static void main(String[] args) {
       PrintStream ps = new PrintStream(System.out);
       ps.println("Hello world!");
       
       double R = 2.0f;
       double PI = 3.14159f;
       double A = PI*(Math.pow(R, 2.0f));
       System.out.println("A="+A);
    }   
}
