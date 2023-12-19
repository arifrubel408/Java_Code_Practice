
public class ArrayBubbleSortingOddEven {

    public static void main(String[] args) {
        //Odd and Even Checking with sorting
        int[] array = {8, 5, 16, 11, 15, 12, 18, 17, 13, 14};
        // Array Print
        System.out.println("Array: ");
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Sorted Array: ");
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println();

        System.out.println("Even Number of this array:-");
        for (int k = 0; k < array.length; k++) {
            if (array[k] % 2 == 0) {
                System.out.print(array[k] + " ");
            }
        }

        System.out.println();
        System.out.println();

        System.out.println("Odd Number of this array:-");
        for (int k = 0; k < array.length; k++) {
            if (array[k] % 2 != 0) {
                System.out.print(array[k] + " ");
            }
        }
        System.out.println();
    }
}
