//Tahlia Callegari 
//2428774

package cop2250.spring20.week6.callegari;

import java.math.BigDecimal;

public class Basket {
	private SaleItem [] items;
	private int maxSize;
	private BigDecimal totalCost;
	
	//Instance variables that help count & process
	//items being added to cart
	int itemsInBasket = 0;
	int totalOfItems = 0;
	
	//Constructor that intakes size of basket
	//and sets the size of the array
	public Basket(int basketSize) {
		maxSize = basketSize;
		items= new SaleItem[maxSize];
	}
	//Add items to basket
	public void add(SaleItem item) {
		
		//return if the number of items in the basket equal
		//the size of the array
		if(itemsInBasket>=items.length) {
			return;}
		
		// for every item added
		//increase itemsInBasket by one
		int i = itemsInBasket;
		items[i]=item;
		itemsInBasket++;
		
		//Increase the totalOfItems until
		//the variable is equal to the size of the array
		if(totalOfItems< items.length)
			totalOfItems++;
		
	}
	
	//Return items in array
	public SaleItem[] getItems() {
		return items;
		
	}
	//Return totalOfItems in basket
	public int getBasketSize() {
		return totalOfItems;
	}
	
	//Find and return totalCost
	public BigDecimal getTotalCost() {
		//Initialize totalCost
		totalCost = new BigDecimal(0.00);
		
		//Add cost of each item in list via loop
		for (int i = 0; i< totalOfItems; i++) {
			totalCost = totalCost.add(items[i].getCost());
		}
		return totalCost;
	}
	//Format and convert items in array as
	// a string & print out accordingly
	public String toString() {
		String dSign = "$";
		//initiate buffer
		StringBuffer buffer = new StringBuffer("Items in Basket:\n");
		buffer.append("----------------\n");
		
		//this loop goes through each item in array
		//and assigns it to a variable and
		//then adds them to the buffer
		for (int i = 0; i<totalOfItems; i++) {
			String name = items[i].getName();
			BigDecimal price = items[i].getCost();
			buffer.append(name +" "+ dSign + price.toString() + "\n");
		}
		
		return buffer.toString();
	}
}
