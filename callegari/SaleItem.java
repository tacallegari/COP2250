//Tahlia Callegari 
//2428774

package cop2250.spring20.week6.callegari;

import java.math.BigDecimal; 

public class SaleItem {
	private String name;
	private BigDecimal cost;
	
	//Constructor that intakes item name & cost
	public SaleItem(String itemName, BigDecimal itemCost) {
		this.name = itemName;
		this.cost= itemCost;
	}
	//Returns name
	public String getName() {
		return name;
	}
	//Return cost
	public BigDecimal getCost() {
		return cost;
	}
}
