
package OOP_Java;

import java.util.Arrays;
import java.util.List;

class Students1{
    private int id;
    private String name;
    private float cgpa;
    private List<String> courses;

    public Students1(int id, String name) {
        this.id=id;
        this.name=name;
    }

    public Students1(int id, String name, float cgpa, List<String> courses) {
//      this.id = id;
//      this.name = name;
        this(id, name);     // constructor chaining
        this.cgpa = cgpa;
        this.courses = courses;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Students{" + "\nid = " + id 
                          + ", \nname = " + name 
                          +", \ncgpa = " + cgpa 
                          + ", \ncourses = " + courses + '}';
    }  
}

public class ConstructorChaining1 {
    public static void main(String[] args) {
        Students1 s11 = new Students1(1001, "Arif", 3.45f, Arrays.asList("c","C++", "Java"));
        
        System.out.println("");
        
        Students1 s22 = new Students1(1002, "Rubel");
        
        s11.setCgpa(3.56f);
        
        System.out.println(s11);
        
        System.out.println("");
        
        System.out.println(s22);
    }
}
