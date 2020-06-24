package com.wipro.inheritance;

public class Ex1_Animal {
public static void main(String[] args) {
	Ex1_Animal a=new Ex1_Animal();
	Bird b=new Bird();
	a.eat();
	a.sleep();
	b.eat();
	b.sleep();
	b.fly();
}
void eat()
{
	System.out.println("Animal is Eating");
}
void sleep()
{
	System.out.println("Animal is Sleeping");
}
}

class Bird extends Ex1_Animal{
	void eat()
	{
		System.out.println("Bird is Eating");
	}
	void sleep()
	{
		System.out.println("Bird is Sleeping");
	}
	void fly()
	{
		System.out.println("Bird is flying");
	}
}