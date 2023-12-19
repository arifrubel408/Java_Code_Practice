
import java.util.Scanner;


public class OddEvenNumberMtoN {
    public static void main(String[] args) {
        
    
    Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Start number");
        int start = scanner.nextInt();
        System.out.println("Enter End number");
        int end = scanner.nextInt();
        
        
        printOdd(start, end);
        System.out.println("");
        printEven(start, end);
    }
    public static void printOdd(int start, int end){
         
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd "+i);
            }
        }  
    }
    
            
      public static void printEven(int start, int end){
         
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println("Even "+i);
            }
        }  
    }
            
}
