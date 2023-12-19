package Mypackage;


public class Static_Method3 {
    static int id;
    static String name;
    
    static{
    id=101;
    name="Jamal";
    }
   static void displayData(){
        System.out.println("Id = "+id);
        System.out.println("Name = "+name);
    }
   public static void main(String[] args) {
        Static_Method3.displayData();
    }
}

//class test{
//    public static void main(String[] args) {
//        Static_Method3.displayData();
//    }
//}
