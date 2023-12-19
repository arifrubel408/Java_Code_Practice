package anisulislam.com.tutorial;

import java.util.Random;

public class Math_Demo {

    public static void main(String[] args) {

        double v = Math.max(55, 25);
        System.out.println(v + " is Maximum");
        
        System.out.println("");

        
        double w = 85;
        double u = 65;
        double q1 = Math.max(w, u);
        double q2 = Math.min(w, u);

        System.out.println("______");
        System.out.println("Maximum : "+q1);
        System.out.println("Minimum : "+q2);

        System.out.println("......****......");
        System.out.println(Math.max(w, u) + " Mmaximum");
        System.out.println(Math.min(w, u) + " Minimum");
        System.out.println("............");

        System.out.println("Sum : "+q2 + q1);

        System.out.println(" ");

        double w1 = Math.hypot(3, 2);
        System.out.println("Hypothesis : "+w1);

        System.out.println("");
        double x, y;
        x = 2;
        y = 4;
        double power = Math.pow(x, y);
        System.out.println("Power : " + power);
        
        
        System.out.println("");
        
        int round=Math.round(8.8f);
        System.out.println("Round : "+round);
        
    }
}
