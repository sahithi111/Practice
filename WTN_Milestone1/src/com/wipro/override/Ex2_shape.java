package com.wipro.override;

public class Ex2_shape {
	public static void main(String[] args) {
		Ex2_shape c=new Circle();
		Ex2_shape t=new Triangle();
		Ex2_shape s=new Square();
		c.draw();
		c.erase();
		t.draw();
		t.erase();
		s.draw();
		s.erase();
		
	}
void draw()
{
	System.out.println("Drawing Shape");
}
void erase()
{
	System.out.println("Erasing Shape");
}

}

class Circle extends Ex2_shape{
	void draw()
	{
		System.out.println("Drawing circle");
	}
	void erase()
	{
		System.out.println("Erasing Cirle");
	}
}

class Triangle extends Ex2_shape{
	void draw()
	{
		System.out.println("Drawing Triangle");
	}
	void erase()
	{
		System.out.println("Erasing Triangle");
	}
}

class Square extends Ex2_shape{
	void draw()
	{
		System.out.println("Drawing Square");
	}
	void erase()
	{
		System.out.println("Erasing Square");
	}
}
