package com.wipro.string_Stringbuff;

public class Ex1_str {
public static void main(String[] args) {
	String s="abccba";
	StringBuffer ob=new StringBuffer(s);
	ob.reverse();

}
}
package music;
public interface Playable {
	public void play() {};
}

package music.wind;
import music.Playable;
public class Saxophone implements Playable {
	public void play() {
        System.out.println("Saxophone is being played");
    }
}

package music.string;
import music.Playable;
public class Veena implements Playable {
	public void play() {
        System.out.println("Violin is being played");
    }
}