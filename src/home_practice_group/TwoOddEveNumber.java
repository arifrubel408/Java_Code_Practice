
package home_practice_group;

import java.util.Scanner;



public class TwoOddEveNumber {
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
               System.out.println("Enter 1st number :");
        int a= sc.nextInt();
////        System.out.println("Enter 1st number :");
////        int b= sc.nextInt();
      
       if(a%2==0){
            System.out.println(a+" is Even number");       
       }else{
            System.out.println(a+" is Odd number");
       }


    }
}
