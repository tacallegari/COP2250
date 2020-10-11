package cop2250.spring20.week7.callegari;

import java.io.File;
import java.util.ArrayList;

import org.junit.rules.ExpectedException;

public class ParserTester {

	public static void main(String[] args) throws RecordException {
		Parser p = new Parser();
		File f = new File("C:Users/Tahlia/Downloads/data.txt");
        ArrayList<ShippingRecord> records = p.parse(f);
        
		
		System.out.print(records.toString());
	}
	
	;

}
