/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypackage;

/**
 *
 * @author Cloud
 */
public class Odd_number_sum_50 {
    public static void main(String[] args) {
        
        int sum=0;
        for (int i = 1; i <= 10; i= i+2) { 
           if(i%2 != 0)
            sum +=i;
            continue;
            
        }
        System.out.println(sum);
        
    }
}
