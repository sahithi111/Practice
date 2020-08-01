
public class ExceptionTest{
	public static void main(String[] args) {
		try {
			ExceptionTest a=new ExceptionTest();
			a.badMethod();
			System.out.println("A");
		}
		catch(Exception e)
		{
			System.out.println("B");
		}
		finally {
			System.out.println("C");
		}
	}
void badMethod()
{
	throw new Error();
}
}

//C followed by errexceptiom