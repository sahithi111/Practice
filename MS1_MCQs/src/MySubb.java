class MySuperr{
	public MySuperr(int i) {
		System.out.println("super"+i);
	}
}

public class MySubb extends MySuperr {
public MySubb() {
	super(2);
	System.out.println("sub");
}
public static void main(String[] args) {
	MySuperr sup=new MySubb();
}
}

//super2
//ub
