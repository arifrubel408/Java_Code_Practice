
import java.util.Scanner;


public class ArrayDiagonal {
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);

        int[][] a = new int[3][3];
        
        //sum storing array
          int sumOfDiagonal = 0;
          int sumOfUpper = 0;
          int sumOfLower = 0;

        System.out.println("Input for a ");
        for (int row = 0; row <= 2; row++) {
            for (int col = 0; col <= 2; col++) {
               // System.out.printf("a [%d][%d] = ",row, col);
                a[row][col] = in.nextInt();
            }
        }
        
        System.out.println(" ");
        
        
         System.out.println("Output for a ");
        for (int row = 0; row <= 2; row++) {
            for (int col = 0; col <= 2; col++) {
                
                if (row==col) {  //Diagonal
                    
                    sumOfDiagonal = sumOfDiagonal +  a[row][col];
                }
                
                 if (row<col) {  //upper row er theke col boro
                    
                    sumOfUpper = sumOfUpper +  a[row][col];
                }
              
                  if (row>col) {  //Lower row er theke col chot0
                    
                    sumOfLower = sumOfLower +  a[row][col];
                }
                  
            }
        }
        
        System.out.println("Sum of Diagonal = " +sumOfDiagonal);
        System.out.println("Sum of Upper = " +sumOfUpper);
        System.out.println("Sum of Upper = " +sumOfUpper);
        System.out.println("Sum of Lower = " +sumOfLower);
        
    }
}
