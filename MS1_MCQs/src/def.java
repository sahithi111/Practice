interface Baseu{
	boolean m1();
	byte m2(short s);
}
abstract class Base2 implements Baseu{
	public boolean m1() {                         ///executes
		return true;
	}
}
public class def {

}
