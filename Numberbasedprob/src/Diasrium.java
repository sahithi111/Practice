
public class Diasrium {
	public static void main(String[] args) {
		int s=0,n=175,r,c=0;
		int temp=n;
		while(n!=0)
		{
			c++;
			n=n/10;
		}
		n=temp;
		while(n!=0)
		{
			r=n%10;
			s=s+(int)Math.pow(r,c);
			n=n/10;
			c--;
		}
		System.out.println(s);
		if(temp==s)
			System.out.println("Disarium");
		else
			System.out.println("Not Disarium");
	}
}
