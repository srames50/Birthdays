// CS210 Assignment #4 "Birthdays"
// Shyam Ramesh

import java.util.*;

public class Birthdays {
    public static void main(String[] args) {
       // instantiating scanner
       Scanner input = new Scanner(System.in);
       // requesting todays date and month from user 
       System.out.print("Please enter today’s date (month day): ");
       // storing user input in variables using scanner
       int todaysMonth = input.nextInt();
       int todaysDate = input.nextInt();
       // responding to user with dayCount method calculation
       System.out.printf("Today is %d/%d/2023, day #%d of the year.\n", todaysMonth, todaysDate, dayCount(todaysMonth, todaysDate));
       System.out.println(" ");
       // prompting user for person #1's birthday
       System.out.print("Please enter person #1’s birthday (month day): ");
       int p1bMonth = input.nextInt();
       int p1bDay = input.nextInt();
       
       System.out.printf("%d/%d/2023 falls on day #%d of 365.\n", p1bMonth, p1bDay, dayCount(p1bMonth, p1bDay));
       System.out.printf("Your next birthday is in %d day(s). \n\n", daysTill(dayCount(todaysMonth, todaysDate), dayCount(p1bMonth, p1bDay)));
       
       // same thing but for person 2
       System.out.print("Please enter person #2’s birthday (month day): ");
       int p2bMonth = input.nextInt();
       int p2bDay = input.nextInt();
       
       System.out.printf("%d/%d/2023 falls on day #%d of 365.\n", p2bMonth, p2bDay, dayCount(p2bMonth, p2bDay));
       System.out.printf("Your next birthday is in %d day(s). \n\n", daysTill(dayCount(todaysMonth, todaysDate), dayCount(p2bMonth, p2bDay)));
       
       // checking which birthday is sooner
       System.out.printf(birthdayEval(dayCount(p1bMonth, p1bDay), dayCount(p2bMonth, p2bDay))); 
       
       System.out.println(" ");
       
       // fun fact
       System.out.println("Did you know: On December 18th in 1865, by proclamation of the U.S. secretary of state slavery was outlawed.");
       
    }

    
// method that checks which birthday is sooner
public static String birthdayEval(int b1, int b2) {
	String val = "";
	if(b1 < b2) {
		val = "Person #1’s birthday is sooner";
	} else if (b2 < b1) {
		val = "Person #2’s birthday is sooner";
	} else {
		val = "Wow, you share the same birthday! ^_^";
	}
	
	return val;
}
    
// method that calculates days till birthday
public static int daysTill(int today, int bDay) {
	int daysTill = 0;
	if(bDay < today) {
		daysTill = (366 - (today - bDay));
	}else if(bDay >= today) {
		daysTill = bDay - today;
	}
	
	return daysTill;
}
    
// method that returns absolute day of the year
public static int dayCount(int currMonth, int currDay) {
	// setting a string with how many days are in each month
	// '1' is for 28 days, '2' is for 30 days and '3' is for 31 days
	String months = "313232332323";
	
	int numDays = currDay;
	
	// a for loop iterating through the string months adding the appropriate number of days for the month
	for(int i = 1; i < currMonth; i++) {
		if(months.charAt(i) == '3') {
			numDays += 31;
			} 
		else if (months.charAt(i) == '2') {
			numDays += 30;
			} 
		else {
			numDays += 28;
			}
	
	}
	return numDays;
}

}