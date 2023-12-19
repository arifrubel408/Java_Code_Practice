
package anisulislam.com.tutorial;


public class Varargs {
   
//   void add(int numm1, int num2){
//       System.out.println(numm1+num2);
//   }
//   
//   void add(int numm1, int num2, int num3){
//       System.out.println(numm1+num2+num3);
//   }
//   void add(int numm1, int num2, int num3,int num4){
//       System.out.println(numm1+num2+num3+num4);
//   }
   
    void add(int ... num){
       int sum = 0;
        for (int x : num) {
            sum+= x;
        }
        System.out.println(sum);
   }
    
    
}

class TestVarargs{

    public static void main(String[] args) {
        Varargs vr = new Varargs();
            vr.add(12, 8);

            vr.add(12, 8, 7);
            vr.add(12, 8, 7 ,3);


       
    }
}