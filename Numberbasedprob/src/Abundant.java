
public class Abundant {
	public static void main(String[] args) {
		int i,s=0,n=12;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
				s=s+i;
		}
		if(s>n)
			System.out.println("Abundant");
	}
}
