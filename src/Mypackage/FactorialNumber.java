/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypackage;

import java.util.Scanner;

/**
 *
 * @author Cloud
 */
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner arif=new Scanner(System.in);
        
        System.out.println("Enter a number");
        int n=arif.nextInt();
        int x=1;
        for(int i=1; i<=n;i++){
            x *=i;
        }
        System.out.println("Factorial is "+ x);
    }
}
