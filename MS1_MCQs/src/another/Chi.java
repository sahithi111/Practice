package another;
class Par{
	public int dostufff(int x)
	{
		return x*2;
	}
}
public class Chi extends Par {
public static void main(String[] args) {
	Chi ob=new Chi();
	long x=ob.dostufff(7);
	System.out.println(x);
}
public long dostufff(int x)
{
	return x*3;
}
}
