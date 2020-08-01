abstract class MyClasss{
	void init() {}
	abstract int calculate();
}
class MyImpl extends MyClasss{
	int calculate() {
		System.out.println("invoke calcu");
		return 1;
	}
}
public class Testuuu {
public static void main(String[] args) {
	MyImpl m1=new MyImpl();
	m1.init();
	m1.calculate();
}
}
////print invoki calcu