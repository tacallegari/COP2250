//Time dilation

//Tahlia Callegari
//2428774

//Side Note: I had a difficult time understanding
//the equation so I could work it into the program.
//Science wasn't my strong suit..


package cop2250.spring20.week2.callegari;

import java.util.Scanner; //Import Scanner for input
public class Program2_2 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in); //Initiate scanner
		
		//Display Title
		System.out.println("Time dilation calculator");
		System.out.println("Based on Einstein's theory of relativity");
		System.out.println();
		
		//Constant
		double speedOfLight =3.0 * (Math.pow(10,8));
		
		//Prompt user for time in motion
		System.out.println("Please insert time in years: ");
		int time= input.nextInt();
		
		//Prompt user for velocity
		System.out.println("Please enter time (years) relative to the speed of light (as a decimal): ");
		double velocity =input.nextDouble();
		
		System.out.println(velocity);
		
		//Calculate
		double timeElasped=( time / (Math.sqrt(1-Math.pow((velocity*speedOfLight),2))));
		
		//Print Result
		System.out.printf("%.2f",timeElasped);
		
		

	}

}
