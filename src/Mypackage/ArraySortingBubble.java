package Mypackage;





public class ArraySortingBubble {
    public static void main(String[] args) {
        int[] arr ={1,9,5,4,6};

        // Original array
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        // Sorting
        System.out.println("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
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
