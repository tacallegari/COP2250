package cop2250.spring20.week7.callegari;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestParser 
{

	@Rule
	  public final ExpectedException exception = ExpectedException.none();
	
	@Before
	public void setUp() throws Exception 
	{
		
	}
	
	@Test
	public void testParse() throws RecordException 
	{
		Parser p = new Parser();
		File f = new File("data.txt");
        ArrayList<ShippingRecord> records = p.parse(f);
        
        assertEquals(5,records.size());
        
	}
	
	@Test
	public void testParseException() throws RecordException  
	{
		exception.expect(RecordException.class);
		exception.expectMessage("File not found!");
		
		Parser p = new Parser();
		File f = new File("junk.dat");

        ArrayList<ShippingRecord> records = p.parse(f);
	}
	
	

}