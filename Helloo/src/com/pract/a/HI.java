package com.pract.a;

public class HI {
public static void main(String[] args) {
	Parent p=new Child();
}
}

class Parent{
	public Parent() {
		super();
		System.out.println("parent");
	}
}
class Child extends Parent{
	public Child() {
		System.out.println("child");
	}
}
