package Mypackage;


import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {
        Random random = new Random();

        for (int dd = 1; dd <= 3; dd++) {
            int ran = random.nextInt(100);
            System.out.println("Random numbers : " + ran);
        }

        System.out.println("");
        // Random random = new Random();
        int ran = random.nextInt(10);   //0-9
        System.out.println("Random 0-9: " + ran);
        
         System.out.println("");
        // Random random = new Random();
        int ran1 = random.nextInt(11)+10; //0-20
        System.out.println("Random 0-20: " + ran1);

        System.out.println(" ");
        //   Random random = new Random();

        int sum = 0;
        for (int i = 1; i <= 4; i++) {
            int ra = random.nextInt(100);
            System.out.println("Random : " + ra);
            sum += ra;
        }
        System.out.println("Total Random number Sum : " + sum);
        
        
        
        System.out.println("");
           

        int rando = (int) (Math.random()*10);
        
        System.out.println("Random Math Class 0-9= "+rando);
        
        
        System.out.println("");
        int rando0 = (int) (Math.random()*91)+10;
        
        System.out.println("Random Math Class 0-100= "+rando0);
        
    }
}
