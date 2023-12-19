
package OOP_Java;

import java.util.List;

class Student{
    private int id;
    private String name;
    private float cgpa;
    private List<String> courses;

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
        return "Student{" + "id = " + id 
                          + ", \nname = " + name 
                          +", \ncgpa = " + cgpa 
                          + ", \ncourses = " + courses + '}';
    }  
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        
        System.out.println(s1);
        System.out.println(" ");
        System.out.println(s2);
        
        System.out.println("");
    }
}
