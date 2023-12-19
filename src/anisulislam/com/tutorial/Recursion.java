
package anisulislam.com.tutorial;


public class Recursion {
 
    int fact(int n){
        if (n==1) {
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
}
class TestRecursion{
    public static void main(String[] args) {
        Recursion re = new Recursion();
      int result = re.fact(4);
        System.out.println(result); 
    }
}