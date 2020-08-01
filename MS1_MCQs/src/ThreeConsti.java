
public class ThreeConsti {

public static void main(String[] args) {
	 new ThreeConsti(4L);
}
public void ThreeConsti(int x) {
	this();
	System.out.println(x*2);
}
public void ThreeConsti(long x) {
	this((int)x);
	System.out.println(x);
}
public void ThreeConsti() {
	System.out.println("no-arg");
}
}
