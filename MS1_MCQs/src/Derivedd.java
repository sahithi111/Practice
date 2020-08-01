class Baseeea {
void display()throws Exception{throw new Exception();}  //derived
}
public class Derivedd extends Baseeea{
	void display() {System.out.println("derived");}
public static void main(String args[]) {
	new Derivedd().display();
}
	}
