package Mypackage;


import java.util.Scanner;


public class Input_Number_sum {
    public static void main(String[] args) {
         Scanner arif=new Scanner(System.in);
        
        System.out.print("Enter a number :" ); //234
        int num=arif.nextInt();
        
        int sum=0;
        int temp =num;
        while (temp != 0) {            
            int r =temp%10;
            sum +=r;
            temp =temp/10;
            System.out.println(r);
        }
        System.out.println("Total sum : "+sum);
    
    
    Scanner arif1=new Scanner(System.in);
        
        System.out.print("Enter a number :" ); //432 reverse number
        int num1=arif1.nextInt();
        
        int sum1=0;
        int temp1 =num1;
        while (temp1 != 0) {            
            int r1 =temp1%10;
            sum1 = sum1*10+r1;
            temp1 =temp1/10;
            System.out.println(r1);
        }
        System.out.println("Total sum : "+sum1);
    }
}
