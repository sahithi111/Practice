
public class Harshad {
	public static void main(String[] args) {
		int s=0,n=156,r;
		int temp=n;
		while(n!=0)
		{
			r=n%10;
			s=s+r;
			n=n/10;
		}
		System.out.println(s);
		if(temp%s==0)
			System.out.println("Harshad");
		else
			System.out.println("Not Harshad");
	}
}
