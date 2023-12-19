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
public class Leapyear {
    public static void main(String[] args) {
        System.out.println("Leap Year testing");
         Scanner arif=new Scanner(System.in);
        int year=arif.nextInt();
        if((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println(year+" is Leap year");
        }else{
         System.out.println(year+" is Not Leap year");   
        }
        
    }
}
