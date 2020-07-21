package com.tms.inheritance;

public class HomeCat extends Cat
{
	private String address;
	private String owner;

	public HomeCat(int age, String name, String address, String owner)
	{
		super(age, name);
		this.address = address;
		this.owner = owner;
	}

	public void nassatVTapki()
	{
		System.out.println("pis pis pis =)))");
	}

	@Override
	public void voice() {
		System.out.println("Дай жрать");
	}
}
