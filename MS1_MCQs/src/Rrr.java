class Aaa{
	int i;
	void display() {
		System.out.println("i");
	}
}
class Bbb extends Aaa{
int j;
void display() {
	System.out.println(j);
}
}
public class Rrr{
public static void main(String[] args) {
	int []x= {1,2,3};
	int y[]=x;
	System.out.println(y[2]);
	Bbb ob=new Bbb();
	ob.i=1;
	
	
}
}

