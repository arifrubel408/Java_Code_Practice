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
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.println("Enter a number");
        int x = input.nextInt();
        int y =0;
        for(int i=2; i<x; i++){
            if(x%i==0){
                y++;
                break;
            }
        }
        if(y>0){
        System.out.println("Not prime");
        }else{
            System.out.println("Prime");
        }
        
    }
}
