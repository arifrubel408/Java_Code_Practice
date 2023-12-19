
import java.util.Scanner;


public class Armstrong_Number {
    public static void main(String[] args) {
        
        // 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 (Armstrong Number)
        
         Scanner arif=new Scanner(System.in);
        
        System.out.print("Enter a number : " ); //234
        int num=arif.nextInt();
        
        int sum=0;
        int temp =num;
        while (temp != 0) {            
            int r =temp%10;
            sum =sum+r*r*r;
            temp =temp/10;
            System.out.println(r);
        }
        if (sum==num) {
            System.out.println("Armstrong"); 
        }else{
             System.out.println("Not Armstrong");
        }
        System.out.println("Total sum : "+sum);
        
        System.out.println(" ");
        
        
         Scanner arif1 = new Scanner(System.in);

        System.out.print("Enter a start number : "); 
        int num1 = arif1.nextInt();

        System.out.print("Enter a end number : "); 
        int num12 = arif1.nextInt();
        
     int count=0;
        int sum1=0;
        for (int i = num1; i <= num12; i++) {
             int temp1 = i;
             
            
            while (temp1 != 0 ) {
                int r1 = temp1 % 10;
                sum1 = sum1+ r1*r1*r1;
                temp1 = temp1 / 10;
              //  System.out.println(r1);
            }
        
        if (sum1==i) {
            System.out.println(" "+i);
            count++;
        } 
         sum1 = 0;
        }
        System.out.println("Total Armstrong number is : " + count);
    }
}
