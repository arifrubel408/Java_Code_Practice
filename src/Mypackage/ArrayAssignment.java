package Mypackage;


import java.util.Scanner;

public class ArrayAssignment {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String day[] = {"Mon", "Tues", "Wednes", "Thurs", "Fri", "Satur", "Sun"};
        System.out.println("Enter day number (1-7): ");
        int n = in.nextInt();
        String d = "";
        for (int i = 0; i < day.length; i++) {
            if (i == n - 1) {
                d = day[n - 1];
            }
        }
        System.out.println("The day is: " + d);
    }
}
