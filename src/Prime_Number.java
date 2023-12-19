
import java.util.Scanner;

public class Prime_Number {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int num, count=0;
//        System.out.print("Enter a number ");
//        num = in.nextInt();
//        for (int i = 2; i < num; i++) {
//            if (num%2==0) {
//                count++;
//                break;
//            }  
//        }
//        if (count==0) {
//            System.out.println("Prime");
//        } else {
//            System.out.println("Not Prime");
//        }

//        Scanner in = new Scanner(System.in);
//        int num, count = 0;
//        System.out.print("Enter a number ");
//        num = in.nextInt();
//        if (num == 0 || num == 1) {
//            System.out.println("Not Prime");
//        } else {
//            for (int i = 2; i < num; i++) {
//                if (num % 2 == 0) {
//                    count++;
//                    break;
//                }
//            }
//            if (count == 0) {
//                System.out.println("Prime");
//            } else {
//                System.out.println("Not Prime");
//            }
//        }
//        
//        
//
//Scanner in = new Scanner(System.in);
//        int num, count = 0;
//        System.out.print("Enter a number ");
//        num = in.nextInt();
//        if (num == 0 || num == 1) {
//            System.out.println("Not Prime");
//        } else {
//            for (int i = 2; i < num/2; i++) {
//                if (num % 2 == 0) {
//                    count++;
//                    break;
//                }
//            }
//            if (count == 0) {
//                System.out.println("Prime");
//            } else {
//                System.out.println("Not Prime");
//            }
//        }
//        
//        Scanner in = new Scanner(System.in);
//        int m, n, count = 0;
//        System.out.print("Enter a initial number ");
//        m = in.nextInt();
//        System.out.print("Enter a Final number ");
//        n = in.nextInt();
//
//        for (int i = m; i < n; i++) {
//            for (int j = 2; j <= i-1; j++) {
//                if (i % j == 0) {
//                    count++;
//                    break;
//                }
//            }
//
//            if (count == 0) 
//                System.out.println(i);
//                count = 0;
//        }

        Scanner in = new Scanner(System.in);
        int m, n, count = 0, numOfPrime = 0;
        System.out.print("Enter a initial number ");
        m = in.nextInt();
        System.out.print("Enter a Final number ");
        n = in.nextInt();
        int sum = 0;
        for (int i = m; i < n; i++) {
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i);
                numOfPrime++;
                sum += i;
            }
            count = 0;
        }
        System.out.println("Total " + m + " to " + n + " Prime numbers are " + numOfPrime);
        System.out.println("Total prime sum " + sum);

        if (sum % 2 == 0) {
            System.out.println(" 2 divisor");
        } else if (sum % 3 == 0) {
            System.out.println(" 3 divisor");
        } else if (sum % 5 == 0) {
            System.out.println(" 5 divisor");
        }else{
            System.out.println("not");
        }
    }
}
