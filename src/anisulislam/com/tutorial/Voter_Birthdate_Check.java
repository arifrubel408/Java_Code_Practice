
package anisulislam.com.tutorial;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Voter_Birthdate_Check {
 
    public static void main(String[] args) {
        Scanner arif = new Scanner(System.in);
        
        System.out.println("birthdate yyyy-MM-dd:");
        
        String birthdateStr = arif.nextLine();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthdate = LocalDate.parse(birthdateStr, formatter);
        LocalDate currentDate = LocalDate.now();
        Period age =Period.between(birthdate, currentDate);
        Period periodToEighteen = Period.between(currentDate,birthdate.plusYears(18));
        
        if(age.getYears()>= 18){
            System.out.print("Congreates! You are a voter");
        }else{
            int days = periodToEighteen.getDays();
            int month = periodToEighteen.getMonths();
            int years = periodToEighteen.getYears();
            
            System.out.print("You will become a voter in "+years+" years "+month+"\n months "+days+" days");
        }
        
    }
}
