package Mypackage;


public class StringBufferclass {
     public static void main(String[] args) {
         
        String s ="Arif";
        StringBuffer sb = new StringBuffer(s);
         System.out.println(sb);
         
         sb.append(" Rubel ");
         sb.append(408);
         System.out.println(sb);
         
         sb.reverse();
         System.out.println(sb);
         
         sb.setLength(5);
         System.out.println(sb);
         
         sb.delete(2, 4);
         System.out.println(sb);
         
         
         String s1 = "madam";
         
         
         StringBuffer sb1 = new StringBuffer(s1);
         String s2 =  sb1.reverse().toString();
         
       
       if(s1.equals(s2)){
           
           System.out.println("Palindrome");
       }else{
           System.out.println("not palindrome");
       }
    }
}
