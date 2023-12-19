
package home_practice_group;

public class SumSerise {
    public static void main(String[] args) {
        int result=Serise(5);
        System.out.println("Sum of serise ="+result);
    }
    public static int Serise(int n){
        
        int sum=0;
        for (int i = 1; i <= 5; i++) {
            sum +=i;
        }
        return sum;
    }
}
