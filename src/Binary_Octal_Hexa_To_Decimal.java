
public class Binary_Octal_Hexa_To_Decimal {
    public static void main(String[] args) {
        
       // Othre to decimal
        
        String binary = "1010";
        Integer decimal = Integer.parseInt(binary, 2);
        System.out.println("Binary to Decimal = "+decimal);
        
         String octal = "675";
        Integer decimal1 = Integer.parseInt(octal, 8);
        System.out.println("Octal To decmal = "+decimal1);
        
        
        String hexa = "ABCD";
        Integer decimal11 = Integer.parseInt(hexa, 16);
        System.out.println("Hexa To Decimal = "+decimal11);
    }
}
