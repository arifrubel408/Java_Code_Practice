package Mypackage;


import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] a = new double[5];

        System.out.println("Please Enter 5 Number's : ");

        a[0] = input.nextDouble();
        a[1] = input.nextDouble();
        a[2] = input.nextDouble();
        a[3] = input.nextDouble();
        a[4] = input.nextDouble();

        System.out.println("Array values :");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }

        double sum = 0;
        sum = a[0] + a[1] + a[2] + a[3] + a[4];

        System.out.println(" ");
        System.out.println("Array Sum : " + sum);

        System.out.println("");

        System.out.println("Please Enter 5 Number's : ");
        double sum1 = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextDouble();
        }
//        for (int i = 0; i < 5; i++) {
//            sum1 +=a[i];
//        }
        for (int i = 0; i < a.length; i++) {
            sum1 += a[i];
        }
        double avg = sum1 / a.length;
        System.out.println(" ");
        System.out.println("Array Sum : " + sum1);
        System.out.println("Array Average : " + avg);

        System.out.println("");
        double max = a[0];
        double min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
            if (min > a[i]) {
                min = min;
            }
        }
        System.out.println("Maximum number of array is : " + max);
        System.out.println("Minimum number of array is : " + min);

        System.out.println("");
        
        int[] ar = new int[5];
        System.out.println("Please Enter 5 Number's : ");

        for (int i = 0; i < ar.length; i++) {
            ar[i] = input.nextInt();
        }
        int odd = 0;
        int even = 0;
        System.out.println("Odd number of array is : ");
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 != 0) {
                System.out.print(ar[i] + ", ");
            }
        }

        System.out.println("");
        System.out.println("Even number of array is : ");
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 == 0) {
                System.out.print(ar[i] + ", ");
            }
        }
        System.out.println("");

    }
}
