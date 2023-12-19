package Mypackage;


import java.util.Scanner;

public class Array2dmulty {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] a = new int[2][3];
        int[][] b = new int[2][3];
        
        //sum storing array
          int[][] c = new int[2][3];

        System.out.println("Input for a ");
        for (int row = 0; row <= 1; row++) {
            for (int col = 0; col <= 2; col++) {
                System.out.printf("a [%d][%d] = ",row, col);
                a[row][col] = in.nextInt();
            }
        }

        System.out.println(" ");
        
        System.out.println("Input for b ");
        for (int row = 0; row <= 1; row++) {
            for (int col = 0; col <= 2; col++) {
                  System.out.printf("b [%d][%d] = ",row, col);
                b[row][col] = in.nextInt();
            }
        }

         System.out.println(" ");
        
        System.out.println("Print for a");
        System.out.println("for a");
        for (int row = 0; row <= 1; row++) {
            for (int col = 0; col <= 2; col++) {
                System.out.print("\t" + a[row][col]);
            }
            System.out.println(" "); // for row col show
        }

         System.out.println(" ");
        
        System.out.println("Print for a");
        System.out.println("for b");
        for (int row = 0; row <= 1; row++) {
            for (int col = 0; col <= 2; col++) {
                System.out.print("\t" + b[row][col]);
            }
            System.out.println(" "); // for row col show
        }
        
         System.out.println(" ");
        //adding a and b
        System.out.println("Adding matrix");
        for (int row = 0; row <= 1; row++) {
            for (int col = 0; col <= 2; col++) {
                System.out.print("\t" + (a[row][col]+b[row][col]));
            }
            System.out.println(" "); // for row col show
        }
        
        
          System.out.println(" ");
          
          
        //adding a and b
         System.out.println("Array storing");
        System.out.println("Adding matrix");
        for (int row = 0; row <= 1; row++) {
            for (int col = 0; col <= 2; col++) {
               
                c [row][col] = ((a[row][col]+b[row][col]));
                System.out.print("\t"+c[row][col]);
            }
            System.out.println(" "); // for row col show
        }

    }
}
