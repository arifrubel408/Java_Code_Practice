
package anisulislam.com.tutorial;


public class Encapsulation {
   private String name; 
   private int age; 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

 class TestEncap{
     public static void main(String[] args) {
         Encapsulation en = new Encapsulation();
         en.setName("Arifuzzaman");
         en.setAge(29);
         
         System.out.println("Name : "+en.getName());
         System.out.println("Age : "+en.getAge());
     }
}
