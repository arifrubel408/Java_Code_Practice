
public class Preparation {

    /**
     * variable method constructor static block instance block
     */
    /**
     * variable 
     * 1 static / class variable 
     * 2 instance / non static variable 
     * 3 local variable
     */
    
    private int id;
    private String name;
    private int age;

    public Preparation(int id, String name, int age) {
        this.id = id;
        this.name = name;  
        this.age = age;  
    }
//     public Preparation(int id, String name, int age) {
//        
//        this(id, name);
//        this.age=age;
//        
//    }
     
    public Preparation(Preparation p){
    id= p.id;
    name = p.name;
    age= p.age;
    }

   public void display(){
       System.out.println("Id = "+ id);
       System.out.println("Name = "+ name);
       System.out.println("Age = "+ age);
   }
    

    public static void main(String[] args) {
        
        Preparation p1= new Preparation(101, "Arif", 31);
        
     //   Preparation p2= new Preparation(102, "Shahidul", 29);
        Preparation p2= new Preparation(p1);
        
        p1.display();
        System.out.println("");
        p2.display();
       
        
    }
}
