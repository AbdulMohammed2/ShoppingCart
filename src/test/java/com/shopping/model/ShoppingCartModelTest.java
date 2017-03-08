package com.shopping.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class ShoppingCartModelTest extends TestCase
{
	ShoppingCartModel shoppingCartModel;
	
    @Before
	public void setUp()
	{
		shoppingCartModel = new ShoppingCartModel(2, 3);
	}
    
    @Test
    public void testShoppingCartModel()
    {
    	ShoppingCartModel shoppingCartModelActual = new ShoppingCartModel(2, 3);
    	assertEquals(shoppingCartModel, shoppingCartModelActual);	
    }
    
    @Test
    public void testShoppingCartModelNotEqual()
    {
    	ShoppingCartModel shoppingCartModelActual = new ShoppingCartModel(3, 3);
    	assertNotSame(shoppingCartModel, shoppingCartModelActual);
    }
    
    
    
    @After
    public void tearDown()
    {
    	shoppingCartModel=null;
    }
}
