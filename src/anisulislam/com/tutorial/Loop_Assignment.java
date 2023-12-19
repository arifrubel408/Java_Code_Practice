package anisulislam.com.tutorial;

import java.util.Scanner;

public class Loop_Assignment {

    public static void main(String[] args) {
//       int sum=0;
//       for(int i=1;i<=10;i++){
//           System.out.print(i+" ");
//           sum +=i;
//       } System.out.println();
//       System.out.println("Total sum :"+sum);
//       
//        System.out.println("");
////        
//      int summ=0;
//       int j=2;
//        while (j<=10) { 
//            System.out.print(j+" ");
//            summ +=j;
//            j+=2;
//         
//        }
//        System.out.println();
//        System.out.println("Total even sum : "+summ);
//        
//         System.out.println(""); 
//         
//         System.out.print(" Enter a nnumber for Factorial : ");
//        Scanner arif=new Scanner(System.in);
//        int n, factorial =1;
//        
//        n =arif.nextInt();
//        for (int i = 1; i <= n; i++) {
//            factorial*=i;
//           System.out.print(i+" ");
//        }System.out.println();
//        System.out.println(" "+n+"'s Factorial is : "+factorial);
//        
//        
//        
//        
//         System.out.println(""); 
//         
//        Scanner ar=new Scanner(System.in);
//        int strt, end;
//       
//        int oddsum=0;
//        System.out.print(" Enter a nnumber for start : ");
//        strt =ar.nextInt();
//        System.out.print(" Enter a nnumber for End : ");
//         end =ar.nextInt();
//         
//         for (int u = strt; u <= end; u++) {
//             if(u%2!=0){
//             oddsum+=u;
//                 System.out.print(u+" ");
//             }
//        }
//         System.out.println();
//         System.out.println("from "+strt+" to "+end+" Odd number's sum  is = "+oddsum);
//         
//         
//         
//         System.out.println();
//         System.out.println(" 1^1+2^2+3^3+.......+n^2=? ");
//         System.out.print(" Enter a number for n : ");
//         
//          Scanner arr=new Scanner(System.in);
//        int z, sum2=0;
//        z=arr.nextInt();
//       for (int k = 1; k <= z; k++) {
//           System.out.print(k+"x"+k+" ");
//           sum2 +=k*k;
//       }
//       System.out.println();
//        System.out.println("Square serise Sum is " +sum2);
//         
//        
//          
//         System.out.println();
//         System.out.println(" 1x2x3x4.......xn=? ");        // like Factorial
//         System.out.print(" Enter a number for n : ");
//         
//          Scanner arr1=new Scanner(System.in);
//        int r, sum3=1;
//        r=arr1.nextInt();
//       for (int v = 1; v <= r; v++) {
//           System.out.print(v+" ");
//           sum3 *=v;
//       }
//       System.out.println();
//        System.out.println("Square serise Sum is " +sum3);
//        
//        
        System.out.println();
        System.out.println(" 1^1x2^2x3^3x.......xn^2=? ");
        System.out.print(" Enter a number for n : ");

        Scanner arri = new Scanner(System.in);
        int z;
        z = arri.nextInt();
        
        int sum22 = 1;
        int a = 1;
        int b =1;
        for (int k = 1; k <= z; k++) {
            sum22 *= k * k;
            System.out.print(k + "x" + k + " = " + k * k + "," + " ");
            
            
            a =k*k;
                System.out.println(" Cumulative "+ b+ " x "+a+" = "+a*b);
            b =a;
        }

        System.out.println(" ");
        System.out.println("Square serise Sum is " + sum22);

        System.out.println(" ");
          
           
        
        
        while (true) {            
        
        Scanner arif = new Scanner(System.in);
        System.out.println("Enter User Nmme : ");
        String aa =arif.next();
       
            System.out.println("");
        System.out.println("Enter Password : ");
        int bb =arif.nextInt();
        
        if(aa.equals("anis") && bb == 123){
                System.out.println("Welcome to the system");
        }else{
               System.out.println("SORRY! User name and password doesn't match ");  
        }
    } 
    }
}
