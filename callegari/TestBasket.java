//Tahlia Callegari 
//2428774

package cop2250.spring20.week6.callegari;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class TestBasket
{
	@Test
	public void testSaleItem()
	{
		SaleItem tv = new SaleItem("TV", new BigDecimal(500.50));
		
		assertEquals("TV",tv.getName());
		assertEquals(500.50,tv.getCost().doubleValue(),2);
	}

	@Test
	public void testTotal()
	{
		Basket basket = new Basket(5);
		basket.add(new SaleItem("Book", new BigDecimal(5.00)));
		basket.add(new SaleItem("HeadPhones", new BigDecimal(21.50)));
		basket.add(new SaleItem("DVD", new BigDecimal(11.50)));
		
		assertEquals(38.0,basket.getTotalCost().doubleValue(),2);
	}
	
	@Test
	public void testSize()
	{
		Basket basket = new Basket(5);
		basket.add(new SaleItem("Book", new BigDecimal(5.00)));
		basket.add(new SaleItem("HeadPhones", new BigDecimal(21.50)));
		basket.add(new SaleItem("DVD", new BigDecimal(11.50)));
		
		assertEquals(3,basket.getBasketSize());
	}
	
	@Test
	public void testMax()
	{
		Basket basket = new Basket(2);
		
		// add 3
		basket.add(new SaleItem("Book", new BigDecimal(5.00)));
		basket.add(new SaleItem("HeadPhones", new BigDecimal(21.50)));
		basket.add(new SaleItem("DVD", new BigDecimal(11.50)));
		
		assertEquals(2,basket.getBasketSize());
	}
	
	@Test
	public void testArray()
	{
		Basket basket = new Basket(3);
		
		// add 3
		basket.add(new SaleItem("Book", new BigDecimal(5.00)));
		basket.add(new SaleItem("HeadPhones", new BigDecimal(21.50)));
		basket.add(new SaleItem("DVD", new BigDecimal(11.50)));
		
		assertEquals("Book",basket.getItems()[0].getName());
		assertEquals("HeadPhones",basket.getItems()[1].getName());
		assertEquals("DVD",basket.getItems()[2].getName());
	}
	
	@Test
	public void testShowContents()
	{
		Basket basket = new Basket(3);
		
		// add 3
		basket.add(new SaleItem("Book", new BigDecimal(5.00)));
		basket.add(new SaleItem("HeadPhones", new BigDecimal(21.50)));
		basket.add(new SaleItem("DVD", new BigDecimal(11.50)));
		
		System.out.println(basket.toString());
	}

}