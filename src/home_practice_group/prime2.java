
package home_practice_group;

import java.util.Scanner;


public class prime2 {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        
        System.out.print("Enter a number ");
        int num = in.nextInt();
        
        int count = 0;
        if (num == 0 || num == 1) {
            System.out.println("Not Prime");
        } else {
            for (int i = 2; i < num; i++) {
                if (num % 2 == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(num + " is a Prime");
            } else {
                System.out.println(num +" is not a Prime");
            }
            System.out.println("");
        }
        
        
        
        
        int a = 20; 
        int b = 40;
        
//        if (a == b){
//            System.out.println("Print something");
//        }
        System.out.println("Complet Executing");
        
        
        int x = 20 +40; //60
        
        String n = "arif";
        int c = 18;
        int d =2;
        
        System.out.println(c+n+d); // 18arif2
        System.out.println(n+c+d); // arif182
        System.out.println(c+d+n+c+d); // 20ari
    }
}
