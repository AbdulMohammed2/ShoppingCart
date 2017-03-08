package com.shopping.model;

public class ShoppingCartModel 
{
	
	private int apples;
	private int oranges;
	
	public ShoppingCartModel(int apples ,int oranges)
	{
		this.apples=apples;
		this.oranges=oranges;
	}
	
	public int getApples() {
		return apples;
	}

	public void setApples(int apples) {
		this.apples = apples;
	}

	public int getOranges() {
		return oranges;
	}

	public void setOranges(int oranges) {
		this.oranges = oranges;
	}

	@Override
	public boolean equals(Object obj) {				
		boolean flag = false;
		ShoppingCartModel shoppingModel = ( ShoppingCartModel )obj;
		if( shoppingModel.apples == this.apples )
			flag = true;
		if( shoppingModel.oranges == this.oranges )
			flag = true;
		return flag;
	}

	@Override
	public int hashCode() {
		return this.apples+this.oranges;
	}

	@Override
	public String toString()
	{
		return "("+this.apples+","+this.oranges+")";
	}

}
