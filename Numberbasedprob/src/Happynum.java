
public class Happynum {
	public static void main(String[] args) {
		int s=0,n=13,r;
		int temp=n;
		while(n!=0)
		{
			r=n%10;
			s=s+(r*r);
			n=n/10;
		}
		System.out.println(s);
		if(temp==s)
			System.out.println("Happy");
		else
			System.out.println("Not happy no.");
	}
}
