
import java.util.Scanner;


public class FactorialDemo {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int n, factorial=1;
        System.err.print("Enter a number : ");
        n = in.nextInt();
        for (int i = n; i >=1; i--) {
            factorial *=i;
            System.out.println(i+" ");
            
        }System.out.println("");
        System.out.println(n+" Factorial is "+factorial);
    }
}
