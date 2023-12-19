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
public class NegNum {
    public static void main(String[] args) {
        
    Scanner arif=new Scanner(System.in);
        
        System.out.println("Enter  numbers");
        int n=arif.nextInt();
        int sum=0;
        while(n>0){
            sum +=n;
            n=arif.nextInt();
        }
        System.out.println("Total sum is "+ sum);
    }
            
}
