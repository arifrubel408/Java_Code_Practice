
import java.util.Scanner;


public class ArraySortingUsingScanner {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner scanner = new Scanner(System.in);
        
        // Input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Original array
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        // Sorting
        System.out.println("Sorted Array: ");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Display sorted array
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
            
}
