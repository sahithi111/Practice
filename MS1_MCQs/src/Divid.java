
public class Divid {
public static void main(String[] args) {
	int val=0;
	try {
		int res=10/0;
	}
	finally {
		System.out.println("f");
	}
}
}

//f followed by runtimexcep