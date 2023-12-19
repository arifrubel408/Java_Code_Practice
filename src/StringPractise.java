
public class StringPractise {
    public static void main(String[] args) {
        
        /*
        primitive --> Object => Integer i = Integer.valueOf();
                                Integer i = ii; // auto Boxing
        
        Object --> Primitive => Integer in = new Integer(34);
                           ans: int e = in;  
        
        Primitive --> String => String st = Integer.toString(342);
        
        String --> primitive => int pri = Integer.valueOf("2345");
                                int pr  = Integer.parseInt("353");
        */
        
        
        //  primitive to object
        System.out.println("**** primitive to object *****");
        int i = 380;

        Integer ii = Integer.valueOf(i);
        System.out.println("Object = " + ii);
    
        double d = 235.88;
        Double dd = Double.valueOf(d);
        System.out.println("Object = "+dd);
        
        Double ddd = d; // auto boxing           
        
        System.out.println("***** Object to primitive *******");
        
        Double obj = new Double(345.76);
        double dou = obj;
        System.out.println("Obj double = "+dou);
  
        Integer in = new Integer(ii);
        System.out.println("Obj int = "+in);
         
        // primitive to String
        System.out.println("******* Primitive to String *******");
        
        int inn = 3423;
        String st = Integer.toString(inn);
        System.out.println("String = "+st);
        
        double dbl = 434.87;
        String sst = Double.toString(dbl);
        System.out.println("String Double = "+sst);
        
        //String to primitive
        System.out.println("***** String to primitive *******");
        
        String str = "2344";
        int prim = Integer.valueOf(str);
         int primi = Integer.parseInt(str);
        double ddbl = Double.valueOf(str);
        System.out.println("primiive = "+prim+" "+primi+" "+ddbl);
     
    }

}
