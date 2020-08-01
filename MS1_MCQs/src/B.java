class A{
	public void bar() {
		System.out.println("A");
	}
}
public class B extends A{
	public static void main(String[] args) {
		A a=new B();
		a.bar();
	}
	public void bar() {
		System.out.println("B");
	}

}

//B