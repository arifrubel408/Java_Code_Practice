package Mypackage;


public class WrapperClassPractise {
    public static void main(String[] args) {
        // primitive to non primitive /object = Auto Boxing
        
        int a = 30;
        Integer b = Integer.valueOf(a);
        System.out.println(b);
        
        Integer c = a;     //Integer.valueOf(a);  auto generate by compiler
        System.out.println(c);
        
        
        double d = 20.30;
        Double dd = Double.valueOf(d);
        System.out.println(dd);
        
        Double ddd = d;
        System.out.println(ddd);
        
        
        
        //Object to primitive
        
        double f = 30.89;
        Double ff = new Double(f);  // new Double(30.89);
        
        double e =ff;
        System.out.println(e);
        
        System.out.println(" ");
        
        // constructor approach --> Object
        
        byte bb = 10; 
        
        Byte b10 = new Byte((byte)bb);
        
        Byte b1 = new Byte((byte)bb);
        Byte b2 = new Byte((byte)20);
        
        System.out.println(b1 +" "+b2);
        
        System.out.println(" ");
        
        
        // factory bmethod (return object)
        
      //  WrapperClassPractise w = getInstance();  // fectory method
        
//        static WrapperClassPractise getInstance(){
//        return new WrapperClassPractise();
//        }
    
        
    }
}
