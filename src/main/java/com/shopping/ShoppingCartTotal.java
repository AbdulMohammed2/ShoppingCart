package com.shopping;

import com.shopping.model.ShoppingCartModel;

public class ShoppingCartTotal 
{
	private static final double eachAppleCost = 0.6;
	
	private static final double eachOrangeCost = 0.25;
	
	public double priceWithOutDiscount(ShoppingCartModel shoppingCartModel)
	{
		double totalPrice =0.0;
		if(shoppingCartModel == null)
		{
		     return totalPrice;
		}
						
		ShoppingCartFunction shoppingCartFunc = (x,y) -> {
			int apples;
			int oranges;
			if(x<0)
			{
				apples=0;
			}
			else
			{
				apples=x;
			}
			if(y<0)
			{
				oranges=0;
			}
			else
			{
				oranges=y;
			}			
			return (apples * eachAppleCost) + (oranges * eachOrangeCost);
		};
		
		totalPrice = shoppingCartFunc.totalPrice(shoppingCartModel.getApples(), shoppingCartModel.getOranges());
		return totalPrice;
	}
	
	public double priceWithDiscount(ShoppingCartModel shoppingCartModel)
	{
		double totalPrice =0.0;
		if(shoppingCartModel == null)
		{
		     return totalPrice;
		}
						
		ShoppingCartFunction shoppingCartFunc = (x,y) -> {
			int apples;
			int oranges;
			if(x<0)
			{
				apples=0;
			}
			else
			{
				apples=x;
			}
			if(y<0)
			{
				oranges=0;
			}
			else
			{
				oranges=y;
			}
			
			double totalApplePriceAfterSimpleOffer = ((apples/2) * eachAppleCost)+ ((apples%2 )* eachAppleCost);
			double totalOrangePriceAfterSimpleOffer = ((oranges - (oranges/3)) * eachOrangeCost);
			return totalApplePriceAfterSimpleOffer+totalOrangePriceAfterSimpleOffer;
		};
		
		totalPrice = shoppingCartFunc.totalPrice(shoppingCartModel.getApples(), shoppingCartModel.getOranges());
		return totalPrice;
	}

}
