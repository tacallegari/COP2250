//Tahlia Callegari
//2428774
//
//Loops and Modularizing Code with Methods
//
package cop2250.spring20.week3.callegari;
import java.util.Scanner; //import Scanner
public class Program3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);//initialize Scanner
		
		//Prompt user for starting date
		System.out.println("Enter a starting Date: mm-dd-yyyy ==>");
		String startDate = input.next();
		
		//Prompt user for ending date
		System.out.println("Enter a ending date: mm-dd-yyyy ==>");
		String endDate = input.next();
		
		//Display results
		long numOfDays = getDaysOld(startDate, endDate); 
		System.out.println("days is: " + numOfDays);

	}
	//Calculate how many days between the two dates inputed
	public static long getDaysOld(String startDate, String endDate) {

		//create accumulator variables for loops
		int daysInMonth = 0; 
		int daysInYear = 0;
		int totalDays = 0;
		
		//Convert startDate & endDate into integers and
		//slice them into different variables
		int startMonth = Integer.parseInt(startDate.substring(0,2));
		int startDay = Integer.parseInt(startDate.substring(3,5));
		int startYear =Integer.parseInt(startDate.substring(6,10));
		
		int endMonth = Integer.parseInt(endDate.substring(0,2));
		int endDay = Integer.parseInt(endDate.substring(3,5));
		int endYear =Integer.parseInt(endDate.substring(6,10));
		
		//Calculate days in between years using for loop
		for (int year = startYear; year < (endYear-1);) {
			year ++; //adds one to variable
			
			//This nested loop determines if year
			//is a leap year or not and adds
			//days to accumulator totalDays
			if (isLeapYear(year) == true) {
				daysInYear = 366;}
			else {
				daysInYear = 365;}
			totalDays += daysInYear;}
		
		//Calculate how many days in starting year
		//using for loop
		for (int month = (startMonth-1); month <= 12;){
			month ++; //adds one to variable
			
			//initialize startDate year as year used for 
			//daysInMonth method
			int year = startYear; 
			
			daysInMonth = daysInMonth(year,month);
			totalDays += daysInMonth; //add days to accumulator
		}
		totalDays -= startDay; //subtract days prior to startDay
		
		//Calculate how many days in ending year
		//using for loop
		for (int month = 0; month < (endMonth-1);) {
			month ++; //adds one to variable
			
			//initialize endDate year as year used for 
			//daysInMonth method
			int year = endYear;
			
			daysInMonth = daysInMonth(year,month);
			totalDays += daysInMonth; //add days to accumulator
			}
		
		totalDays += endDay; //add days of endMonth to accumulator
		
		return totalDays; //return variable 
	}
	
	//This method determines if year is leap year
	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 !=0);
	}
	
	//This method determines how many days are in specified month
	public static int daysInMonth(int year,int month) {
		if (month ==1 || month ==3 || month ==5 || month ==7 
				|| month ==8 || month ==10 || month == 12)
			return 31;
		if (month ==4 || month ==6 || month ==9 || month ==11)
			return 30;
		if (month ==2) return isLeapYear(year) ? 29:28;
			return 0; //If month is incorrect
		}
	
}
