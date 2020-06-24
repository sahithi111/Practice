package com.wipro.override;

public class Ex1_fruit {

	char name,taste,size;
	
	public static void main(String args[])
	{
		Apple a=new Apple();
		a.eat();
		Orange o=new Orange();
		o.eat();
	}
	void eat()
	{
		System.out.println("name:Banana");
		System.out.println("taste:sweet");
	}
}
class Apple extends Ex1_fruit{
	void eat()
	{
		System.out.println("name:Orange");
		System.out.println("taste:sweeet");
	}
}
class Orange extends Ex1_fruit{
	void eat()
	{
		System.out.println("name:Apple");
		System.out.println("taste:sour");
	}
}
