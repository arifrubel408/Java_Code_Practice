
public class Static_Method2 {
    int x;
    
  void display1(){
      x = 10;
      
      display2();
        System.out.println("I am non Static method");
      System.out.println("X= "+x);
    }
 
    static void display2(){
        
        System.out.println("I am Static method");
       // System.out.println("X= "+x);  // not useable
    }   
}
class Test1{
    public static void main(String[] args) {
        Static_Method2.display2();
        
        
        Static_Method2  sm = new Static_Method2();
        sm.display1();
    }
}
