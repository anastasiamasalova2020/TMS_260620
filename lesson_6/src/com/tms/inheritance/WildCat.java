package com.tms.inheritance;

public class WildCat extends Cat
{
	private String type;

	public WildCat(int age, String name, String type)
	{
		super(age, name);
		this.type = type;
	}

	@Override
	public void voice() {
		System.out.println("ARRRRRHHHRHR");
	}
}
