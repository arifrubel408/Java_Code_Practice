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
public class Maximum3 {
    public static void main(String[] args) {
        Scanner arif=new Scanner(System.in);
        
        System.out.println("Enter 1st numbert");
        int a=arif.nextInt();
        System.out.println("Enter 2nd numbert");
        int b=arif.nextInt();
        System.out.println("Enter 3rd numbert");
        int c=arif.nextInt();
        if(a>b && a>c){
            System.out.println("a is Max number");
        }else if(b>c && b>a){
            System.out.println("b is Max number");
        }else{
            System.out.println("c is Max number");
        }
            
     }
}
