package home_practice_group;

import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {

//    int[] arr = new int [5];
//    arr[0]=3;
//    arr[1]=4;
//    arr[2]=6;
//    arr[3]=7;
//    arr[4]=10;
//    
//    int summation = arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
//    
//    System.out.println("Sum of arr = "+summation);
//    
//        
//        
//        
//        
//    
//    int [] arr1 = {2,4,6,7,9};
   
        Scanner sc = new Scanner(System.in);

        int[] array = new int[5];
        System.out.println("Enter for arrray 5 numbers ");
        
        int sum =0;

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
                sum += array[i];
           // System.out.println("Sum of Array =" + sum);
        }
        
        System.out.println("Sum of Array = " + sum);
        
        int avg = sum/array.length;
          System.out.println("Avg of Array = " + avg);
          
          
          
          /**
           * assume that first number of index is maximum number
           * assume that first number of index is minimum number
           */
          int max = array[2];  // 1
          int min = array[0];
          // 1 2 3 4 5
        //in 0 1 2 3 4
          
          for (int i = 1; i < array.length; i++) {
            if (max < array[i]){  // next numbers check if large
                max = array[i];
            }
            
             if (min >array[i]){  // next numbers check if small
                min = array[i];
            }
        }
          
          System.out.println("Max Number is = "+ max);
          System.out.println("Min Number is = "+ min);
             
          
          System.out.println(" ");
          
          System.out.println("Check even number of array ");
          
          for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0){
                System.out.println(array[i]);
            }
        }
          
          
          System.out.println("Check odd number of array ");
          
          for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                System.out.println(array[i]);
            }
        }
    }
}
