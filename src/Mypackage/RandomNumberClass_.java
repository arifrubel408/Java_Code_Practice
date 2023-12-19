package Mypackage;



import java.util.Random;
import java.util.Scanner;


public class RandomNumberClass_ {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 0-2 ");
       int random1=sc.nextInt();
       
        Random rand = new Random();
        
        int random= rand.nextInt(3);  // 0-9 numbers
        System.out.println("random Number "+random);
        
        if (random1 == random){
        System.out.println(" mathc");
        }
        else{
            System.out.println("Not match");
        }

        

//    Integer one = 100;
//    Integer two = 100;
//        System.out.println(one == two);
//    Integer three = 1000;
//    Integer four = 1000;
//        System.out.println(three == four);
    }
  
}
