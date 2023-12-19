
public class Array4_5 {
    public static void main(String[] args) {
         
        int [][] a = new int[4][5];
        int b = 0;
        
        for (int row = 0; row <= 3; row++) {
            for (int col = 0; col < 4; col++) {
                a [row][col] = b;
                b++;
            }
        }
        
        
         for (int row = 0; row <= 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(" "+ a[row][col]);
            }
             System.out.println(" "); // for row col show
        }
        
    }
}
