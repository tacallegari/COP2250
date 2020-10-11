//Tahlia Callegari 
//2428774

package cop2250.spring20.week7.callegari;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Parser {
	
	//Create empty arraylist
	private ArrayList <ShippingRecord> records;
	
	//This method opens & reads data file, passes each record through ShippingRecord
	//and adds it to the arraylist
	public ArrayList<ShippingRecord>parse(File file) throws RecordException {
		
		//initiate list 
		records = new ArrayList<ShippingRecord>();
		
		try {
			Scanner readFile = new Scanner(file); //Opens the file
			 
			//Reads file
			while(readFile.hasNext()) {
				String firstName = readFile.next();
				String lineSeparator = readFile.next();
				String lastName = readFile.next();
				lineSeparator = readFile.next();
				String streetName = readFile.next();
				lineSeparator = readFile.next();
				String state = readFile.next();
				lineSeparator = readFile.next();
				String item = readFile.next();
				lineSeparator = readFile.next();
				int q = Integer.parseInt(readFile.next()); 
				
			try {
				//Create and pass record through ShippingRecord
				ShippingRecord record = new ShippingRecord();
				record.setFName(firstName);
				record.setLName(lastName);
				record.setStreet(streetName);
				record.setState(state);
				record.setItemDescription(item);
				record.setQty(q);
				
				//Add record to list
				records.add(record);} 
			
			//Catch mismatch record input
			catch(InputMismatchException ex) {
			}
		}
		
		//close file 
		readFile.close();
		}
		//Exception if file doesn't exist that throws
		//RecordException message 
		catch (FileNotFoundException e) {
			throw new RecordException("File not found!");
		}
		return records; //return list
		
	}
}

