
import java.util.Scanner;


public class ArrayDuplicateCount {
    public static void main(String[] args) {
         int [] arr = {5,6,4,3,5,6,3,4,9,8,6,9,8,4};
         
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number : ");
         int value = sc.nextInt();
         int count = 0;
         
         for (int i = 0; i < arr.length; i++) {
            if(value == arr[i]){
                count++;
            }
        }
         System.out.println("Same value  of array= "+count);
    }
}
