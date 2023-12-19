
/**
     * Copy constructor is a special type of constructor that takes same class as argument.
     * 
     * Copy constructor is used to provide a copy of the specific object.
     */
public class MyClass {
    
   static int id;   // static variable
    String name, email; // static / instance variable
     
    MyClass() {
        System.out.println("Default constructor");
    }

    public MyClass(int id, String name, String email) {
        this.id=id;
        this.name=name;
        this.email=email;
        System.out.println("Parameterized constrctor called");
    }
    
    public static String Name(){
        
    return "";
    }
    

    public MyClass(MyClass c) {          // copy constructor
        id= c.id;
        name= c.name;
        email= c.email;
        System.out.println("Copy constructor called");
    }
    
    void Display(int a, int b){
        
//        a=3;
//        b=5;
        System.out.println(a+b);
       
//        System.out.println("Id = "+id);
//        System.out.println("Name = "+name);
//        System.out.println("Email = "+email);
//        
//        System.out.println("");
        
       // System.out.println("Id = "+id+", Name = "+name+", Email = "+email);
    }
    
    public static void main(String[] args) {
        MyClass myClass1 = new MyClass();
          
       // MyClass myclass = new MyClass(101, "Maruf Hossain", "maruf34@gmail.com");
      
        
      //  MyClass myClass2 = new MyClass(myclass);
        
        System.out.println("");
        
        
        
      // myclass.Display();
       
//        myClass2.id=102;
//        myClass2.name="Shahadat Hosain";
//        myClass2.email="Shahadat65@gmail.com";
        
        System.out.println(" ");
       // myClass2.Display();
        
       
        
      //  System.out.println("Static variable "+id);
       myClass1.Display(3, 7);
        
    }
    
}


class learn{
   
    /**
     * variables (properties)
     * method (behaviors)
     * constructor 2 types --> default, parameterized
     * 
     * static block
     * 
     * non static block / instance block
     * 
     */

}