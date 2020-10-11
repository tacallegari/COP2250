//Tahlia Callegari 
//2428774

package cop2250.spring20.week5.callegari;

public class DigitalClock {

	//Create class variables 
	private int hour;
	private int minute; 
	private boolean am;

	//Constructor resets the clock
	public DigitalClock() {
		setTime(12, 0, am);
	}
	
	//Constructor takes in three parameters and assigns them as instance variables
	//in setTime method
	public DigitalClock( int setHour, int setMinute, boolean isMorning ) {
		setTime(setHour, setMinute,isMorning);
	}
	
	//This method sets clock after its been constructed
	public void setTime( int setHour, int setMinute, boolean isMorning) {
		if (1 <= setHour && setHour < 13) {
			hour = setHour;}
		else {
			hour = 1;}
		
		if (0 <= setMinute && setMinute < 60) {
			minute = setMinute;}
		else {
			minute = 0;}
		
		am = isMorning;

		
	}
	//Returns hour
	public int getHour() {
		if (0 <= minute && minute < 60)
			tick();
		return hour;
	}
		
	//Returns minute
	public int getMinute() {
		if (0 <= minute && minute < 60)
			tick();
		return minute;
	}
	//Returns am
	public boolean isMorning() {
		tick();
		return am;
		
	}
	//Tick method process minutes, hours, and am
	//Adds one to minute and hour respectively. 
	//Am is switched once clock strikes 12
	public void tick() {
		if (0<= minute && minute < 60) { 
			minute ++;} //adds one to minute
		else {
			minute =  0; //resets minute
			hour ++;} //adds one to hour
		if (hour > 12)
			hour = 1; //resets hour 
		if (11 < hour && hour < 13) {
			//Switches boolean value
			if (am == true) {
				am = false;}
			else {
				am = true;}
			}
		}
				
	//This method displays clock with
	//formating strings
	public String toString() {
		
		//initialize strings
		String printMinute;
		String time;
		String semicolon = ":";
		
		if (am == true) 
			time = "am";
		else
			time = "pm";
		
		if (minute < 10)
			printMinute = "0" + minute; //adds zero to string
		else
			printMinute = String.valueOf(minute); //convert int to string
		
		return hour + semicolon + printMinute + time;
		}
		
		
	}

	

