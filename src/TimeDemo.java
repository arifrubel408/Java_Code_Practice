
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class TimeDemo {
    public static void main(String[] args) {
        
        LocalTime time = LocalTime.now();
        System.out.println("Time "+time);
        
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh;mm;ss");
        
        String formattedTime = time.format(dateTimeFormatter);
        System.out.println(formattedTime);
        
    }
}
