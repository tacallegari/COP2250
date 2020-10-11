package cop2250.spring20.week5.callegari;

public class TestDigitalClock {

	public static void main(String[] args) {
	
		DigitalClock clock = new DigitalClock();
		
		
		int hour = clock.getHour();
		int minute = clock.getMinute();
		boolean am = clock.isMorning();
		
		
		System.out.println(clock.toString());
		System.out.println(clock.toString());
		
		

	}

}
