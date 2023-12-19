package anisulislam.com.tutorial;

public class Loop_Demo {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Bangladesh "+i);
        }
        System.out.println("");
        
        
        
        for (int i = 2; i <= 10; i+=2) {
            System.out.println("Bangladesh For Loop "+i);
            
            
        }
        System.out.println("");
        
        
        
        for (int i = 10; i >= 1; i-=2) {
            System.out.println(i);
        }
        
        System.out.println("");
        
        int j=2;
        while(j<=10){
            System.out.println("Bangladesh While Loop Even "+j);
            j+=2;
            
        }
        int [] ar ={2, 3, 4, 5};  // 
        for(int x: ar){
            System.out.println("x "+ x);
        }
        
        System.out.println("");
        
        int j1=9;
        while(j1>=1){
            System.out.println("Bangladesh While Loop "+j1);
            j1-=2;
        }
        
        
        System.out.println("");
        
        int r=1;
        do {  
            System.out.println("Bangladesh : "+r);
            r+=2;
            
        } while (r<=10);
        
        
        
        
    }
}
