
import java.util.Scanner;


public class PatternDemo {
    public static void main(String[] args) {
          
        Scanner in = new Scanner(System.in);
        
        
        System.err.print("Enter line  number : ");
        int n= in.nextInt();
        for (int row = 1; row <= n; row++) {  //row
            for (int col = 1; col <= row; col++) {
                System.out.print(" "+col);
            }
            System.out.println();
        }
        
        
        
         Scanner ini = new Scanner(System.in);
        
        
        System.err.print("Enter line  number : ");
        int m= ini.nextInt();
        for (int row = m; row >=1; row--) {  //row
            for (int col = 1; col <= row; col++) {
                System.out.print(" "+col);
            }
            System.out.println();
        }
    }
}
