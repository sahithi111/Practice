
public class sumofcubes {
	public static void main(String[] args) {
		int s=1,n=1234,r;
		while(n!=0)
		{
			r=n%10;
			s=s+(r*r*r);
			n=n/10;
		}
		System.out.println(s);
	}
}
