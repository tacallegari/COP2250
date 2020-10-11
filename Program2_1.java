//Paycheck 

//Tahlia Callegari
//2428774

package cop2250.spring20.week2.callegari;
import java.util.Scanner;//Scanner is located in java.util package

public class Program2_1 {
	public static void main(String[] args) {

		final double FICA = 0.065; //Create FICA tax Constant
		final double MEDICARE = 0.015; //Create Medicare tax Constant
		
		double fedTax = 0.15;
		String martialStatus ="S";
		int exemptValue = 0;
		
		//Create Scanner object
		Scanner input =new Scanner(System.in);
			
		//Prompt user for gross pay 
		//Martial and exempt claim
			
		System.out.print("Enter the gross wages ==>  ");
		double grossPay =input.nextDouble();
		
		System.out.print("Are you married? Y/N ==> ");
		String status =input.next();
		
		if (status == "N"|| status =="n") {
			exemptValue = 1000;}
		else {
			martialStatus ="M";
			System.out.print("Enter the number of exemptions ==> ");}
			int claimExempt =input.nextInt();
		
		//Find Exempt Value based on input	
		switch (claimExempt) {
		case 1: exemptValue += 1000;
			break;
		case 2: exemptValue+= 1800;
			break;
		case 3: exemptValue += 2400;
			break;
		case 4: exemptValue += 3600;
			break;
		default:exemptValue += 4000;
		}

		double adjustedWage = grossPay -exemptValue;
		
		//Calculate net pay & taxes
			
		if (adjustedWage <10001) {
			fedTax = 0;}
		else {
			if ( 10001 < adjustedWage && adjustedWage <300001) {
				fedTax = 0.15;}
			else {
				fedTax = 0.20;}
		}
			
		double totalFedTax = fedTax* adjustedWage;
		double totalFICA = FICA * adjustedWage;
		double totalMedicare = MEDICARE* adjustedWage;
			
		double netPay = grossPay - totalFedTax -totalFICA - totalMedicare;
			
			
			
		//Display paycheck
		System.out.println();
		System.out.println("P a y r o l l  T a x e s");
		System.out.println();
		System.out.printf("Gross Pay %-12.2f", grossPay);
		System.out.println();
		System.out.println();
		System.out.printf("Exemptions: %-12d", claimExempt);
		System.out.println();
		System.out.printf("Marital Status: %-12s", martialStatus);
		System.out.println();
		System.out.printf("Federal Tax: %-12.2f", totalFedTax);
		System.out.println();
		System.out.printf("FICA: %-12.2f",totalFICA);
		System.out.println();
		System.out.printf("Medicare: %-12.2f",totalMedicare);
		System.out.println();
		System.out.println("----------------------");
		System.out.printf("Net Pay %-12.2f", netPay );
	
		
	}

}
