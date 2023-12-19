package Mypackage;


 class Student{

      int count=0;
     
     
//     static{  // compiler auto   // clInt
//     int count; // 0
//     }
     
     { //  intance
     
     
     }
     
     public  void Student(){}
     
     Student(){
     count++;
     
    // this/super
     }
     
     void totalStudent(){
         
         int value = 10;
         System.out.println("Total student = "+count+" "+value);
     }
     
     
}
 
 
 class Person{}
 class Man extends Person{
String leg="2";
void method1(){}
 }
 class Rahim extends Man{
 
 } // single
 class Karim extends Man{} // multilevel

 
 
 
 
 
 class Person1{
 
     static int value=100;
     long l = 76873;
     Person1(){
     //constructor default
     }
     
     Person1(int a){
     //constructor 
     }
     
     static{
     value =101;
         System.out.println("");
     }
     
     {
     //non static /instance block
          l = 79988;
     }
     
 }
 
 class Rahim1 extends Person1{} // single
 class Karim1 extends Person1{} 
 
 
  interface  GetClSS{
  
        final int l = 875;
  }
 
 abstract class DUclass{
     abstract void DoIt();
     
     void We(){}
 }
 
 class Hasan extends  DUclass{
 @Override
  void DoIt(){}
 }
 
 
 
public class StaticVariableCount {
    public static void main(String[] args) {
        Student s1 = new Student();
        
        
        s1.totalStudent();
        
        Student s2 = new Student();
        s2.totalStudent();
        
        Student s3 = new Student();
        s3.totalStudent();
        
        
        Person p =new Person();
        
        
        
        
       // 11500-13000 > 11000
       
    }
    
}
