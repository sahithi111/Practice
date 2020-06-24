
public class Pronic {
public static void main(String[] args) {
	int i,j,c=0,n=37,f=0,s=0,r,c1=0;
	for(i=1;i<=n;i++)
	{
		if(n%i==0)
			c++;
		
}
	if(c==2)
		System.out.println("not prime");
while(n!=0)
{
	r=n%10;
	s=s%10+r;
	n=n/10;
}
for(i=1;i<=s;i++)
{
	if(s%i==0)
		c1++;
}
if(c1==2)
	System.out.println("twisted prime");

else
	System.out.println("not twisted prime");
}
}