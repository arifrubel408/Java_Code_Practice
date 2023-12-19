package Mypackage;


import java.util.Scanner;


public class GcdPractise {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1,n1, num2,n2, reminder;
        
        System.out.println("Enter first number");
        n1=scanner.nextInt();
        
         System.out.println("Enter second number");
        n2=scanner.nextInt();
        
        num1=n1>n2?n1:n2;
        num2=n2>n1?n1:n2;
        
        int m=(num1*num2);
        
        while (num2 != 0) {            
            reminder = num1 % num2;
            num1=num2;
            num2=reminder;
        }
        int gcd=num1;
        System.out.println("GCD is = "+gcd);
        
        
        //System.out.println("m= "+m);
        int lcm=m/gcd;
        
        System.out.println("LCM is="+lcm);
    }
}
