abstract class Shape{
	public abstract void draw();
}
public class Circle extends Shape{
public void draw() {}

public static void main(String[] args) {
Shape s=new Circle();
	s.draw();
}
}