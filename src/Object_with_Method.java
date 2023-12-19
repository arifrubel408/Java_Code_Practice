
class Teacher {

    String name, age, gender, phone;

    void displayInformation() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Gender : " + gender);
        System.out.println("Phone : " + phone);
        System.out.println("\n");
    }
}

public class Object_with_Method {

    public static void main(String[] args) {

        Teacher tec1 = new Teacher();
        tec1.name = "Mohaamd Arifuzzaman";
        tec1.age = "30";
        tec1.gender = "Male";
        tec1.phone = "0176543223";
        tec1.displayInformation();

        Teacher tec2 = new Teacher();
        tec2.name = "Mohaamd Rejwan";
        tec2.age = "29";
        tec2.gender = "Male";
        tec2.phone = "01765432896";
        tec2.displayInformation();
    }

}
