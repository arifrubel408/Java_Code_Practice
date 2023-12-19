package Mypackage;


import java.util.Arrays;

public class StringPractise {

    public static void main(String[] args) {

        String s = "hello world! This is the beauty of Bangladesh.";

        String[] aa= s.split(" ");
        
        for(String xx: aa){
            System.out.println("Split() = "+xx);
        }
        //End of Split
        
        
        System.out.println("");
        
        char[] s3= {'A','r','i','f'};
        System.out.println("chatAt = "+Arrays.toString(s3));

        
        System.out.println("");
        
        
        String s1 = "Mohammad Arifuzzaman";
        String ss = new String("Mohammad Arifuzzaman");

        System.out.println("s =" + s);
        System.out.println("s1 =" + s1);
        System.out.println("SS = " + ss);
        
        if (s1.equals(ss)){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }
        
        System.out.println("");
        
        if (s1.contains(ss)){  // use bequals they check the content
            System.out.println("Contains() = Equals");
        }else{
            System.out.println("Contains() = Not Equals");
        }
        
        System.out.println("");
        
        if (s1.equalsIgnoreCase(ss)){  // use bequals they check the content
            System.out.println("Contains() = Equals");
        }else{
            System.out.println("equalsIgnoreCase() = Not Equals");
        }
        
        
        System.out.println("");
        
         if (s1 == ss){  // obj and variable are not same
            System.out.println("Contains() = Equals");
        }else{
            System.out.println("Contains() = Not Equals");
        }
        
    }
}
