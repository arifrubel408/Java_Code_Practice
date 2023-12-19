package home_practice_group;

interface Playable1 {

    void maxNumber(int a, int b);
}

public class LamdaExpre1 {

    public static void main(String[] args) {

        Playable1 playable1 = (int a, int b) -> {
            
            if (a > b) {
                System.out.println("Max is : " + a);
            } else {
                System.out.println("Max is : " + b);
            }
            
        };
        
        playable1.maxNumber(5, 8);
    }
}
