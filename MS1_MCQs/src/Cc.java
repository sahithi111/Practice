interface l1{}
class Aa implements l1{}
class Bb extends Aa{}
public class Cc extends Bb{
	public static void main(String[] args) {
		Bb b=new Bb();
		Bb b2=(Bb)(Aa)b;
	
	}

}
