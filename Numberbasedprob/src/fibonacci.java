
public class fibonacci {
public static void main(String[] args) {
	int sum,n1=0,n2=1,n=10;
	System.out.println(n1);
	for(int i=0;i<n;i++)
	{
		sum=n1+n2;
		n1=n2;
		n2=sum;
		System.out.println(n1);
	}
		
}
}
