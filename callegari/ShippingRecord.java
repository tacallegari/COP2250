//Tahlia Callegari 
//2428774

package cop2250.spring20.week7.callegari;

public class ShippingRecord {

	public String lName;
	public String fName;
	public String street;
	private String st;
	private int qty;
	private String itemDescription;
	
	//Set last name
	public void setLName(String lastName) {
		lName = lastName;
	}
	//Set first name
	public void setFName(String firstName) {
		fName = firstName;
	}
	//Set street
	public void  setStreet(String s) {
		street = s;
	}
	//Set state
	public void setState(String state) {
		this.st = state;
	}
	//Set item 
	public void  setItemDescription(String item) {
		this.itemDescription = item;
	}
	//Set quantity of item
	public void setQty(int q) {
		this.qty = q;
	}
	//Format & return string of ShippingRecord
	public String toString() {
		return lName + "," + fName + "\t" + street + "\t" + st + "\t" + itemDescription + "\t" + qty;
	}
	
}
