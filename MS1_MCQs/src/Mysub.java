

class MySuper{
	final int calculate(int i,int j)
	{
		return i*j;
	}
}
public class Mysub extends MySuper{
	int calculate(int i,int j)//cant override final meth
	{
		return 2*i*j;
	}
	public static void main(String args[])
	{
		MySuper sup=new Mysub();
		int k=sup.calculate(2,5);
		System.out.println(k);
	}
}
	
