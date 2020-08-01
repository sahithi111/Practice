class Bu{
int m=7;
}
class D extends Bu{
	int m=9;
}
public class Demo {
public static void main(String[] args) {
	Bu b=new Bu();
	D d=new D();
	Bu bd=new D();
	System.out.println(b.m+""+d.m+""+bd.m);
}
}

