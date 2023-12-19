package Mypackage;


public class Decimal_TO_Other {

    public static void main(String[] args) {

        //Decimal to other
        
        int decimal = 15;

        String binary = Integer.toString(decimal, 2);
        String binary1 = Integer.toBinaryString(decimal);
        
        System.out.println("Decimal To Binary = " + binary+" Or "+binary1);
        
        String Octal = Integer.toString(decimal, 8);
        String Octal1 = Integer.toOctalString(decimal);
        System.out.println("Decimal To Octal = " + Octal+" or "+Octal1);
        
        String hexa = Integer.toString(decimal, 16);
        String hexa1 = Integer.toHexString(decimal);
        System.out.println("Decimal To Hexadecimal = " + hexa+" or "+hexa1);

    }
}
