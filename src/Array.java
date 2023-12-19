
public class Array {
    public static void main(String[] args) {
        
        int a [] = new int[5];
        a[0]=3;
        a[1]=6;
        a[2]=9;
        a[3]=12;
        a[4]=15;
        
        int sum= a[0]+a[3]+a[4];
        
        System.out.println("Array calling : "+a[3]);
        System.out.println("Array Length "+a.length);
        System.out.println("Array Sum "+sum);
        
        
        System.out.println(" ");
         int [] b={12,11,10,9,13};
         
         int sum1= b[0]+b[3]+b[4];
        
        System.out.println("Array calling : "+b[3]);
        System.out.println("Array Length "+b.length);
        System.out.println("Array Sum "+sum1);
    }
}
