
import java.util.Scanner;

public class SumOfUserInput {

    public static int SumOfInput(int num) {
        int sum = 0;

        while (num != 0) {
            int remainder = num % 10;
            sum = sum + remainder;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entr a number");
        int num = sc.nextInt();

        System.out.println("Sum Of User Input = " + SumOfInput(num));
        
        System.out.println("");

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Entr a number");
//        int num = sc.nextInt();
//        
//        int sum = 0;
//
//        while (num != 0) {
//            int remainder = num % 10;
//            sum = sum + remainder;
//            num = num / 10;
//        }
//        System.out.println("Sum of Input Number: " + sum);
//        System.out.println("");
    }
}
