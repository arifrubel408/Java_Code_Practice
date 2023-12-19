
package anisulislam.com.tutorial;


public class MethodOverloading {
    void add(double a, double  b){
        System.out.println(a+b);
    }
    void add(int a, int  b, int c){
        System.out.println(a+b+c);
    }
    void add(){
        System.out.println("Something to add");
    }
}

 class Test {
     public static void main(String[] args) {
         MethodOverloading mo = new MethodOverloading();
         mo.add();
         mo.add(2,3);
         mo.add(2.f,7);  // type conversion 
         mo.add(2.2,3.3);
         
         mo.add(2,3,5);
        
        
         
         
     }
 }