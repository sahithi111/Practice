
public class sum_of_digits {
public static void main(String[] args) {
	int s=0,n=1234,r;
	while(n!=0)
	{
		r=n%10;
		s=s+r;
		n=n/10;
	}
	System.out.println(s);
}
}
