class Base{
	Base(){
		System.out.println("Base constrt");
	}
}
public class Derived extends Base {
Derived(){
	System.out.println("Derived constr");
}
public static void main(String args[])
{
	Base b=new Derived();
}
}

//o/p
//Base constrt
//Derived constr