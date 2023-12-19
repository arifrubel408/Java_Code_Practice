package Mypackage;


import java.util.Scanner;




public class TimeTable {
    public static void main(String[] args) {
        int n=5;
        
        for (int m = 1; m <=10; m++) {
           
            System.out.println(n+"x"+m+"="+n*m);   
        }
        
        
        Scanner in =new Scanner(System.in);
        int a,b;
        System.out.println("Enter initial number");
        a = in.nextInt();
        System.out.println("Enter final number");
        b = in.nextInt();
        
         for (int i = a; i <=b; i++) {
             for (int j = 1; j <= 10; j++) {
               System.out.println(i+"x"+j+"="+i*j);   
             } System.out.println("\n\n");
        }
    }
}

