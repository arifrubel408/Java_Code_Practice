
class Teachers {

    String name, gender, phone;
    int age;

    void setDataTeachers(String n, int a, String g, String ph) {
        name = n;
        age = a;
        gender = g;
        phone = ph;
    }
    
    void displayInformation(){
    System.out.println("Name : "+name);
    System.out.println("Age : "+age);
    System.out.println("Gender : "+gender);
    System.out.println("Phone : "+phone);
    System.out.println("\n");
    }
    
}

public class Object_with_Param_Method {

    public static void main(String[] args) {
        Teachers teacher = new Teachers();
        teacher.setDataTeachers("Mohammad Arifuzzaman", 31, "Male", "01743538480");
        teacher.displayInformation();
        
        Teachers teacher1 = new Teachers();
        teacher1.setDataTeachers("Mohammad Rejwan Sharif", 29, "Male", "01973538480");
        teacher1.displayInformation();
    }
}
