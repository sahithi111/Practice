
public class Overload {
public void process() {
}
public String process() { //err here
	return "hello";
}
public float process(int x) {
	return 100.5f;
}
}

//J2SE createsappletd