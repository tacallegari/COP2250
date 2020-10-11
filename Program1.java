//Tahlia Callegari
//2428774
package cop2250.spring20.week1.callegari;

import java.util.Scanner;//Scanner is located in java.util package
public class Program1 {
	public static void main(String[] args) {
		
		final int FEDTAX = 15; //Create Federal tax Constant
		final int FICA = 65; //Create FICA tax Constant
		final int MEDICARE = 14; //Create Medicare tax Constant

		//Create Scanner object
		Scanner input =new Scanner(System.in);
	
		//Prompt user for gross pay and exemptions claimed
	
		System.out.print("Enter the gross wages ==>  ");
		int grossPay =input.nextInt();
	
		System.out.print("Enter the number of exemptions ==> ");
		int claimExempt =input.nextInt();
	
		//Calculate net pay & taxes
	
		int totalFedTax = (FEDTAX* grossPay)/100 + claimExempt*1000;
		int totalFICA = ((FICA * grossPay)/1000);
		int totalMedicare = (MEDICARE* grossPay)/1000;
	
		int netPay = grossPay - totalFedTax -totalFICA - totalMedicare;
	
	
	
		//Display paycheck
		System.out.println();
		System.out.println("       " + "Paycheck");
		System.out.println();
		System.out.println("Gross" + "           " + "$"+ grossPay);
		System.out.println("Federal Tax.....$"+ totalFedTax);
		System.out.println("       " + "FICA.....$" + totalFICA);
		System.out.println("   " + "Medicare.....$"+ totalMedicare);
		System.out.println("----------------------");
		System.out.println("    " +"Net Pay.....$" + netPay );
	
	
	}
}