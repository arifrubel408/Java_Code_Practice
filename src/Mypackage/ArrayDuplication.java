package Mypackage;


public class ArrayDuplication {

    public static void main(String[] args) {
        int[] arr = {6, 4, 3, 5, 6, 3, 4, 8, 8, 9, 9};
        System.out.print("Main array: ");
        
        for (int x : arr) {
            System.out.print(x + " ");
        }

        System.out.println();

        System.out.println("Duplicate elements in the array are:");

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
        
    }
}
