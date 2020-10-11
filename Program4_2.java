//Tahlia Callegari
//2428774
//
//Nine Sided Dice

package cop2250.spring20.week4.callegari;

public class Program4_2 {

	public static void main(String[] args) {
		
		//Create, assign, and display array
		System.out.println("Dice Rolls");
		int [] diceRolls = randomizedRolls();
		
		//print blanks
		System.out.println(); 
		System.out.println();
		
		//Create reference array that counts
		//Occurrences in diceRolls
		int [] counts = countNums(diceRolls);
		
		//Call on void method to display histogram of
		//dice rolls
		System.out.println("Histogram");
		displayCounts(counts);
		

	}
	
	//Create array
	public static int [] randomizedRolls() {
		int[] rolls = new int [20]; //initialize array
		
		//Create random value in range of 1-9 for 
		//each element in array using for loop
		for (int i = 0; i < rolls.length; i++) {
			rolls [i] = 1 + (int) (Math.random() * 9);
			System.out.print(rolls[i] + " ");} //space out each element
		return rolls;} //return array
	
	//This method counts occurrence of rolls
	public static int[] countNums(int[] diceRolls) {
		int[] counts = new int[9]; //initialize array
		
		//This for loop goes through each element
		//in diceRolls and adds value to the 
		//appropriate element in counts based on
		//occurrence in array 'diceRolls'
		for (int i = 0; i < diceRolls.length; i++)
			counts[diceRolls[i] -1]++;
		return counts; //return array
	}
	
	//This void method creates display of histogram
	public static void displayCounts(int[] counts) {
		String symbol = "*"; //create string variable for display
		
		//This for loop goes through entire array
		//and prints the appropriate numerical value of
		//string type 'symbol'
		for (int i = 0; i < counts.length; i++) {	
			System.out.println("("+(int)(i+1)+")" + " " + symbol.repeat(counts[i]));
		}
	}
	
}

