
public class MyCls {
public static void main(String[] args) {
	Deriveddd d=new Deriveddd("hello");
}
}
class Basee{
	Basee(){this("a","b");}
	Basee(String x,String y){
		System.out.println(x+y);
	}
}
class Deriveddd extends Basee{
	Deriveddd(String s){System.out.println(s);}
}
