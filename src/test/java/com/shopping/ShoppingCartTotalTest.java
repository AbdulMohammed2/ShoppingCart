package com.shopping;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.shopping.model.ShoppingCartModel;

import junit.framework.TestCase;

public class ShoppingCartTotalTest extends TestCase
{
	ShoppingCartTotal shoppingCartTotal;
	ShoppingCartModel shoppingCartModel;
	
    @Before
	public void setUp()
	{
    	shoppingCartTotal = new ShoppingCartTotal();
	}
    
    @Test
    public void testPriceWithOutDiscountForModelNull()
    {
    	double totalPrice =shoppingCartTotal.priceWithOutDiscount(shoppingCartModel);    	
    	assertTrue(totalPrice==0.0);
    }
    
    @Test
    public void testPriceWithOutDiscountWithNegativeValues()
    {
    	shoppingCartModel = new ShoppingCartModel(-2, -3);
    	double totalPrice =shoppingCartTotal.priceWithOutDiscount(shoppingCartModel);    	
    	assertTrue(totalPrice==0.0);
    }
    
    @Test
    public void test1PriceWithOutDiscount()
    {
    	shoppingCartModel = new ShoppingCartModel(1, 0);
    	double totalPrice =shoppingCartTotal.priceWithOutDiscount(shoppingCartModel);    	
    	assertTrue(totalPrice==0.6);
    }
    
    @Test
    public void test2PriceWithOutDiscount()
    {
    	shoppingCartModel = new ShoppingCartModel(1, -1);
    	double totalPrice =shoppingCartTotal.priceWithOutDiscount(shoppingCartModel);    	
    	assertTrue(totalPrice==0.6);
    }
    
    @Test
    public void test3PriceWithOutDiscount()
    {
    	shoppingCartModel = new ShoppingCartModel(1, 1);
    	double totalPrice =shoppingCartTotal.priceWithOutDiscount(shoppingCartModel);    	
    	assertTrue(totalPrice==0.85);
    }
    
    @Test
    public void test4PriceWithOutDiscount()
    {
    	shoppingCartModel = new ShoppingCartModel(2, 0);
    	double totalPrice =shoppingCartTotal.priceWithOutDiscount(shoppingCartModel);    	
    	assertTrue(totalPrice==1.2);
    }
    
    @Test
    public void test5PriceWithOutDiscount()
    {
    	shoppingCartModel = new ShoppingCartModel(2, 1);
    	double totalPrice =shoppingCartTotal.priceWithOutDiscount(shoppingCartModel);    	
    	assertTrue(totalPrice==1.45);
    }
    
    @Test
    public void test6PriceWithOutDiscount()
    {
    	shoppingCartModel = new ShoppingCartModel(2, 2);
    	double totalPrice =shoppingCartTotal.priceWithOutDiscount(shoppingCartModel);    	
    	assertTrue(totalPrice==1.7);
    }
    
    @Test
    public void test7PriceWithOutDiscount()
    {
    	shoppingCartModel = new ShoppingCartModel(2, -1);
    	double totalPrice =shoppingCartTotal.priceWithOutDiscount(shoppingCartModel);    	
    	assertTrue(totalPrice==1.2);
    }
    
    @Test
    public void test8PriceWithOutDiscount()
    {
    	shoppingCartModel = new ShoppingCartModel(4, 3);
    	double totalPrice =shoppingCartTotal.priceWithOutDiscount(shoppingCartModel);    	
    	assertTrue(totalPrice==3.15);
    }
    
    @Test
    public void test9PriceWithOutDiscount()
    {
    	shoppingCartModel = new ShoppingCartModel(4, 5);
    	double totalPrice =shoppingCartTotal.priceWithOutDiscount(shoppingCartModel);    	
    	assertTrue(totalPrice==3.65);
    }
    
    @Test
    public void test1PriceWithDiscount()
    {
    	shoppingCartModel = new ShoppingCartModel(1, 0);
    	double totalPrice =shoppingCartTotal.priceWithDiscount(shoppingCartModel);    	
    	assertTrue(totalPrice==0.6);
    }
    
    @Test
    public void test2PriceWithDiscount()
    {
    	shoppingCartModel = new ShoppingCartModel(1, -1);
    	double totalPrice =shoppingCartTotal.priceWithDiscount(shoppingCartModel);    	
    	assertTrue(totalPrice==0.6);
    }
    
    @Test
    public void test3PriceWithDiscount()
    {
    	shoppingCartModel = new ShoppingCartModel(1, 1);
    	double totalPrice =shoppingCartTotal.priceWithDiscount(shoppingCartModel);    	
    	assertTrue(totalPrice==0.85);
    }
    
    @Test
    public void test4PriceWithDiscount()
    {
    	shoppingCartModel = new ShoppingCartModel(2, 0);
    	double totalPrice =shoppingCartTotal.priceWithDiscount(shoppingCartModel);    	
    	assertTrue(totalPrice==0.6);
    }
    
    @Test
    public void test5PriceWithDiscount()
    {
    	shoppingCartModel = new ShoppingCartModel(2, 1);
    	double totalPrice =shoppingCartTotal.priceWithDiscount(shoppingCartModel);    	
    	assertTrue(totalPrice==0.85);
    }
    
    @Test
    public void test6PriceWithDiscount()
    {
    	shoppingCartModel = new ShoppingCartModel(2, 2);
    	double totalPrice =shoppingCartTotal.priceWithDiscount(shoppingCartModel);    	
    	assertTrue(totalPrice==1.1);
    }
    
    @Test
    public void test7PriceWithDiscount()
    {
    	shoppingCartModel = new ShoppingCartModel(2, 3);
    	double totalPrice =shoppingCartTotal.priceWithDiscount(shoppingCartModel);    	
    	assertTrue(totalPrice==1.1);
    }
    
    @Test
    public void test8PriceWithDiscount()
    {
    	shoppingCartModel = new ShoppingCartModel(3, 1);
    	double totalPrice =shoppingCartTotal.priceWithDiscount(shoppingCartModel);    	
    	assertTrue(totalPrice==1.45);
    }
    
    @Test
    public void test9PriceWithDiscount()
    {
    	shoppingCartModel = new ShoppingCartModel(3, 2);
    	double totalPrice =shoppingCartTotal.priceWithDiscount(shoppingCartModel);    	
    	assertTrue(totalPrice==1.7);
    }
    
    @Test
    public void test10PriceWithDiscount()
    {
    	shoppingCartModel = new ShoppingCartModel(3, 3);
    	double totalPrice =shoppingCartTotal.priceWithDiscount(shoppingCartModel);    	
    	assertTrue(totalPrice==1.7);
    }
    
    @Test
    public void test11PriceWithDiscount()
    {
    	shoppingCartModel = new ShoppingCartModel(4, 3);
    	double totalPrice =shoppingCartTotal.priceWithDiscount(shoppingCartModel);    	
    	assertTrue(totalPrice==1.7);
    }
    
    @Test
    public void test12PriceWithDiscount()
    {
    	shoppingCartModel = new ShoppingCartModel(4, 4);
    	double totalPrice =shoppingCartTotal.priceWithDiscount(shoppingCartModel);    	
    	assertTrue(totalPrice==1.95);
    }
    
    
    @Test
    public void test13PriceWithDiscount()
    {
    	shoppingCartModel = new ShoppingCartModel(4, 5);
    	double totalPrice =shoppingCartTotal.priceWithDiscount(shoppingCartModel);    	
    	assertTrue(totalPrice==2.2);
    }
    
    @Test
    public void test14PriceWithDiscount()
    {
    	shoppingCartModel = new ShoppingCartModel(4, 6);
    	double totalPrice =shoppingCartTotal.priceWithDiscount(shoppingCartModel);    	
    	assertTrue(totalPrice==2.2);
    }
    
    @After
    public void tearDown()
    {
    	shoppingCartTotal=null;
    }
}
