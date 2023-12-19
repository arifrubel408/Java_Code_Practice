package Mypackage;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Date_Deme {
    public static void main(String[] args) {
        
        Date date = new Date();
        
        System.out.println("Current Date = "+date);
    
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        String currentDate = dateFormat.format(date);
        System.out.println("Current Date : "+currentDate);
        
    }
}
