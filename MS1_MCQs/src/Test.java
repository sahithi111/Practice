
public class Test {
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
		super();
		System.out.println("child");
	}
}

//parent
//child