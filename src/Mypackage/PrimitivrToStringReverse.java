package Mypackage;


public class PrimitivrToStringReverse {
    public static void main(String[] args) {
        
        //primitive to String
        int x = 100;
        
        String s = Integer.toString(x);
        System.out.println(s);
        
        
        double xx = 100;
        String ss = Double.toString(xx);
        System.out.println(ss);
        
        
        boolean b = true;
        String bb= Boolean.toString(b);
        System.out.println(bb);
        
        
        
        //String to primitive
        
        String st = "543";
        
        int i = Integer.parseInt(st);
        System.out.println(i);
        
        double ii = Double.parseDouble(st);
        System.out.println(ii);
    }
 
}
