package music;
import music.Playable;
import music.Veena;
import music.Sexaphone;
public class Musicmain {
	 public static void main(String args[]) {
	        Veena v=new Veena();
	        Sexaphone s=new Sexaphone();
	        Playable pv, ps; 
	        pv=new Veena();
	        ps=new Sexaphone();
	        v.play(); 
	        s.play(); 
	        pv.play(); 
	        ps.play();
	        
	    }
}


