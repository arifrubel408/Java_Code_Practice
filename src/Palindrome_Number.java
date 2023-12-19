
import java.util.Scanner;

public class Palindrome_Number {

    public static void main(String[] args) {
        Scanner arif1 = new Scanner(System.in);

        System.out.print("Enter a number : "); //434 = 434 reverse number is the same of inpute number
        int num1 = arif1.nextInt();

        int sum1 = 0;
        int temp1 = num1;
        while (temp1 != 0) {
            int r1 = temp1 % 10;
            sum1 = sum1 * 10 + r1;
            temp1 = temp1 / 10;
            System.out.println(r1);
        }
        if (num1 == sum1) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        System.out.println("Total sum : " + sum1);

        
        
        
        
        
        
        
        Scanner arif = new Scanner(System.in);

        System.out.print("Enter a start number : "); //434 = 434 reverse number is the same of inpute number
        int num = arif.nextInt();

        System.out.print("Enter a end number : "); //434 = 434 reverse number is the same of inpute number
        int num12 = arif.nextInt();
        
     int count=0;
        for (int i = num; i <= num12; i++) {
             int temp = i;
             int sum = 0;
            
            while (temp != 0 && i>10) {
                int r1 = temp % 10;
                sum = sum * 10 + r1;
                temp = temp / 10;
              //  System.out.println(r1);
            }
        
        if (sum==i) {
            System.out.println(" "+i);
            count++;
        } 
        }
        System.out.println("Total palidrome number is : " + count);
    }
}
