
public class palindrome {
	public static void main(String[] args) {
		int s=0,n=1234321,r;
		int temp=n;
		while(n!=0)
		{
			r=n%10;
			s=s*10+r;
			n=n/10;
		}
		System.out.println(s);
		if(temp==s)
			System.out.println("Palindrome");
		else
			System.out.println("Not palindrome");
	}
}
