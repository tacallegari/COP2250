//String Sample

//Tahlia Callegari
//2428774
package cop2250.spring20.week2.callegari;

import java.util.Scanner; //Import Scanner
public class Program2_3 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in); //Initiate Scanner
		
		//Prompt user for string
		System.out.print("Please insert three character string: ");
		String trioString = input.nextLine();
		
		//Create Constants
		int midChar2 = trioString.length()/2; //Middle Char
		int midChar1 = midChar2 -1; //Char before Mid Char
		int midChar4 = midChar2 +2;
		
		//if statement
		if (trioString.length() <=2) { //String length condition
			System.out.print("Error");
			System.exit(0);}
		else {
			if(trioString.length() %2 ==0) { //string length even
				String firstHalf =trioString.substring(0,midChar2);
				System.out.print(firstHalf);}
			else { //string length odd 
				System.out.print(trioString.substring(midChar1,midChar4));
				;}
		}
	}

}
