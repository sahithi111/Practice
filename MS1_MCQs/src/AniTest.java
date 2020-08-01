class Animal{
	String name="No name";
	public Animal(String nm) {name=nm;}
}
class DomAni extends Animal{
	String anifam="nofami";
	public DomAni(String family) {anifam=family;}
}
public class AniTest {
public static void main(String[] args) {
	DomAni da=new DomAni("cat");
	System.out.println(da.anifam);
}
}

//cte at line 8