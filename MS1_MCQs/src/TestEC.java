
abstract class Abs {
void setup() {}
abstract int execute();
}

class EC extends Abs{
	int execute() {
		System.out.println("EC invoked");
		return 0;
	}
}
public class TestEC{
	public static void main(String[] args) {
		EC ec=new EC();
		ec.setup();
		ec.execute();
	}
}