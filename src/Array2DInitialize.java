
public class Array2DInitialize {
    public static void main(String[] args) {
        int [][] a =new int[2][3];
        
        a[0][0]=10;
        a[0][1]=20;
        a[0][2]=30;
        a[1][0]=40;
        a[1][1]=50;
        a[1][2]=60;
        
        System.out.println(a[0][0]);
        System.out.println(a[0][1]);
        System.out.println(a[0][2]);
        
        System.out.println(a[1][0]);
        System.out.println(a[1][1]);
        System.out.println(a[1][2]);
        
        
        
        System.out.println(" ");
        System.out.println("For loop use");
        
        for (int row = 0; row <= 1; row++) {
            for (int col = 0; col <= 2; col++) {
                
                System.out.println(a[row][col]);
                
            }
            
        }
        
        
        
        System.out.println(" ");
        System.out.println("For loop use \"Matrix\"");
        
        for (int row = 0; row <= 1; row++) {
            for (int col = 0; col <= 2; col++) {
                
                System.out.print(" "+a[row][col]);
                
            }
            System.out.println(" ");
        }
        
        
    }
}
