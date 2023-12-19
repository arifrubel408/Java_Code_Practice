
public class Static_Method {
    
    void display1(){
        System.out.println("I am non Static method");
    }
    
    
    static void display2(){
        System.out.println("I am Static method");
    }
}
class Test23{
    public static void main(String[] args) {
        Static_Method.display2();
        
        Static_Method  sm = new Static_Method();
        sm.display1();
    }
}