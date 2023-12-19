package Mypackage;


import java.util.*;


public class Multiples_3and5 {
    
    public static void main(String[] args) {
        Scanner arif = new Scanner(System.in);
        
        System.out.println("Enter a number : ");
        int n =arif.nextInt();
        
        
            if((n % 3 == 0) && (n % 5 == 0)){
               System.out.println("FooBar");
                
            } else if(n % 3 == 0){
                System.out.println("Foo");
            } else if(n % 5 == 0){
                System.out.println("Bar");
            }else{
                System.out.println(n);
            }
        
    }
}
