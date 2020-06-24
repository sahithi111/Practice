
public class Deficient {
public static void main(String[] args) {
	int i,s=0,n=12;
	for(i=1;i<=n;i++)
	{
		if(n%i==0)
			s=s+i;
	}
	if(s<2*n)
		System.out.println("Deficient");
}
}
