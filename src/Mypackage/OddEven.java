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
public class OddEven {
    public static void main(String[] args) {
        Scanner arif=new Scanner(System.in);
        int a=arif.nextInt();
        int b=arif.nextInt();
        int c=(a+b);
        System.out.println("Total sum is "+c);
        if(c%2==0){
            System.out.println("Enen");
        }else{
            System.out.println("Odd");
        }
    }
        
}
