package Mypackage;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cloud
 */
public class Fibonacchi1 {
    public static void main(String[] args) {
        Scanner arif=new Scanner(System.in);
        
        System.out.println("Enter a number" );
        int n=arif.nextInt();
        
        int a=0;
        int b=1;
        int next;
        for(int i=0; i<n; i++){
            System.out.println(a);
            next=a+b;
            a=b;
            b=next;
        
        }
        
    }
}
