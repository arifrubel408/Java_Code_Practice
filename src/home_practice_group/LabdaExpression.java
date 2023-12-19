
package home_practice_group;




public class LabdaExpression {
    public static void main(String[] args) {
        Playable playable = () -> {
            System.out.println("Game Name ...... ");
        };
        
        playable.gameName();
        
    }
 
}
interface Playable{
    void gameName();
}