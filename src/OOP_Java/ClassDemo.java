package OOP_Java;

class Parent {

}
class C1 extends Parent {

}
class C2 extends Parent {

}
class C3 extends Parent {

}
public class ClassDemo {

    public static void main(String[] args) {
        //int value;
        Parent p = new C3();

        if (p instanceof C1) {
            System.out.println("C1");
        } else if (p instanceof C2) {
            System.out.println("C2");
        } else if (p instanceof C3) {
            System.out.println("C3");
        } else {
            System.out.println("Nothing");
        }
        
        /*
        parent 
        
     C1   C2    C3
        */  
        
        int [] v={1,3,4,2};
        for (int x : v){
            System.out.println(x);
        }
        
        
        System.out.println(5+8+"13");  // 1313  add+String
        
        System.out.println("13"+8+5); // 1385 int + add = all String concate
        
        System.out.println("13"+(8+5)); // 1313 String +(add)= string+add
       
    }
}
