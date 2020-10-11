//Tahlia Callegari 
//2428774

package cop2250.spring20.week6.callegari;

import java.math.BigDecimal;

public class Test {

	public static void main(String[] args) {
		
		
		Basket basket = new Basket(2);
		
		basket.add(new SaleItem("Book", new BigDecimal(5.00)));
		basket.add(new SaleItem("HeadPhones", new BigDecimal(21.50)));
		basket.add(new SaleItem("DVD", new BigDecimal(11.50)));
		
		System.out.print(basket.toString());
		System.out.println();
		System.out.println(basket.getTotalCost());
	}

}
