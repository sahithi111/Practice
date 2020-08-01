interface i1{
	int process();
}
class C implements i1{
	int process()    //err
	{
		System.out.println("CCCCCC");
		return 1;
	}
	void display() {
		System.out.println("c c c c ");
	}
}
public class Test5 {
public static void main(String[] args) {
	C c=new C();
	c.process();
}
}
