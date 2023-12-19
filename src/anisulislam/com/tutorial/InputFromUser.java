
package anisulislam.com.tutorial;

import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        
    
        Scanner arif = new Scanner(System.in);

        System.out.println("Enter a valuue for number one : ");
        int num1=arif.nextInt();
        System.out.println("Enter a valuue for number Two : "); 
        int num2=arif.nextInt();
        int sum = num1+num2;

        System.out.println(num1+" + "+num2+" Sum is = "+sum);
        
        System.out.println(" ");
        System.out.println(" ");
        
        // Assignment-3
        
        System.out.println("Id :");
        int id =arif.nextInt();
        
        System.out.println(" ");
        System.out.println("Title :");
        System.out.println(" ");
        String title =arif.nextLine();
        arif.nextLine();
        
        System.out.println(" ");
        System.out.println("Price :");
        double price =arif.nextDouble();
        
         arif.nextLine();
        System.out.println(" ");
        System.out.println("Description :");
        String description =arif.nextLine();
        
        System.out.println(" ");
        
        System.out.println("Category :");
        String category =arif.nextLine();
       
        System.out.println(" ");
        System.out.println("Answer is : ");
        
        System.out.println("Id :"+id+"\nTitle :"+title+"\nPrice :"+price+"\nDescription :"+description+"\nCategory :"+category);
    }
}
