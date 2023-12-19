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
public class ThreenumUserInpt {
    public static void main(String[] args) {
        Scanner arif=new Scanner(System.in);
        
        System.out.println("Enter 1st numbert");
        int a=arif.nextInt();
        System.out.println("Enter 2nd numbert");
        int b=arif.nextInt();
        System.out.println("Enter 3rd numbert");
        int c=arif.nextInt();
        int d=(a+b+c)/3;
        if(d>80){
            System.out.println("Excellent");
        }else if(d>60){
            System.out.println("Good");
        }else if(d<50){
        System.out.println("Fail");
    }
    }
}
