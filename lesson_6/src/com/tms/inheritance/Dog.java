package com.tms.inheritance;

public class Dog extends Animal {

	private String name;

	public Dog(int age, String name)
	{
		super(age);
		this.name = name;
	}

	@Override
	public void voice()
	{
		System.out.println("ГАВ ГАВ");
	}
}
