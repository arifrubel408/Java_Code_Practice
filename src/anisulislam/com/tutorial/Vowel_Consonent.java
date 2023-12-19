package anisulislam.com.tutorial;

import java.util.Scanner;

public class Vowel_Consonent {

    public static void main(String[] args) {
        Scanner arif = new Scanner(System.in);

        char ch;
        System.out.print("Enter a Letter : ");

        ch = arif.next().charAt(0);

//        if(ch == 'a'){
//            System.out.print("Vowel");
//        }else if(ch == 'e'){
//            System.out.print("Vowel");
//        }else if(ch == 'i'){
//            System.out.print("Vowel");
//        }else if(ch == 'o'){
//            System.out.print("Vowel");
//        }else if(ch == 'u'){
//            System.out.print("Vowel");
//        }else{
//             System.out.print("Consonent");
//        }
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is Vowel");
        } else {
            System.out.println(ch + " is Consonent");
        }

        System.out.println(" ");

        if (ch >= 'a' && ch <= 'z') {     //a-z
            System.out.println(ch + " is Small Letter");
        } else if (ch >= 'A' && ch <= 'Z') {     //A-Z
            System.out.println(ch + " is Capital Letter");
        } else {
            System.out.println(ch + " is not a letter");
        }

        System.out.println(" ");

//        System.out.println("Do you love JAVA?");
//        while(true){
//        
//        char j=arif.next().charAt(0);
//        
//         if(j == 'y' || j == 'Y'){     //a-z
//            System.out.println("I do love JAVA.");
//            break;
//        }else if(j == 'n' || j == 'N'){     //A-Z
//            System.out.println("I don't love JAVA.");
//            break;
//        }else{
//            System.out.println("Enter letter only : Y/y or N/n");
//        }
//      }
        while (true) {
            System.out.println("Do you have completed Mater's. y/n?");
            char mas = arif.next().charAt(0);
            
            System.out.println("Are you fluent in english?");
            
            char flu = arif.next().charAt(0);

            if ((mas == 'y'|| mas=='Y') && (flu == 'y' || flu =='Y')) {

                System.out.println("You are elegible for the job interview");
                break;
            } else {
                System.out.println("Sorry! You are not elegible for the job interview");
                break;
            }
        }
        
        

    }
}
