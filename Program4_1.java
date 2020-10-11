//Tahlia Callegari
//2428774
//
//Diving into who Won
//
//This program calculates which diver won
//based on comprehensive scores and difficulty level.

package cop2250.spring20.week4.callegari;

public class Program4_1 {

	public static void main(String[] args) {
		
		//Create variable with an array of Diver 1 & 
		//2 scores.
		System.out.print("Diver 1 Scores: ");
		int[] diverScore1 = createScores();
		
		System.out.print("\nDiver 2 Scores: ");
		int [] diverScore2 = createScores();
		
		System.out.println(); //Blank line
		
		//Create random dive difficulty level
		int difficultyLevel = 1 + (int)(Math.random() * 3);
		System.out.println("\nDive Difficulty: "+ difficultyLevel);
	
		System.out.println(); //break
		
		//Calculate the final average score for Diver 1 & 2
		int finalScore1 = (diverScore1[2]+ diverScore1[3]+ diverScore1[4]) *difficultyLevel;
		int finalScore2 = (diverScore2[2]+ diverScore2[3]+ diverScore2[4]) *difficultyLevel;	
			
		//Display leader board + results 	
		System.out.println("LeaderBoard");
		System.out.println("-----------");
		
		//Who won? Use if-else loop to display winner first
		if (finalScore1 > finalScore2) {
			System.out.println("Diver 1: " + finalScore1);
			System.out.println("Diver 2: " + finalScore2);
		}
		else{
			System.out.println("Diver 2: " +finalScore2);
			System.out.println("Diver 1: " + finalScore1);
		}
	}
	//This method creates randomized elements in a array
	public static int [] createScores() {
		int[] scores = new int [7]; //initialize array
		
		//create random value for each element in array
		//using for loop
		for (int i = 0; i < scores.length; i++) {
			scores [i] = 1 + (int) (Math.random() * 10);
			System.out.print(scores[i] + " "); //displays array
			}
		
		selectionSort(scores);//organize array 
		return scores; //return array
	}
	//This method sorts arrays from smallest to largest
	public static void selectionSort(int [] list) {
		
		//Nested for loop to find smallest value and
		//swap it for list [i] which increases as
		//the loop processes through the list.length	
		for (int i = 0; i < list.length - 1; i ++) {
			int currentMin = list[i]; 
			int currentMinIndex = i;
			
			for (int j = i + 1; j < list.length; j ++) {
				if (currentMin > list[j]){
				currentMin = list[j];
				currentMinIndex =j;}
		}
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;}
			}
		}
	}

