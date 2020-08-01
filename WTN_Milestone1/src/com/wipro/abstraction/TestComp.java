package com.wipro.abstraction;
import java.util.*;
abstract class Compartment{
	public abstract String notice();
}
class FirstCls extends Compartment{
	public String notice()
	{
		return "Notice is 1st cls compartment";
	}
	
}
class Ladies extends Compartment{
	public String notice()
	{
		return "Notice:Ladies compartment";
	}
	
}
class General extends Compartment{
	public String notice()
	{
		return "Notice:general compartment";
	}
	
}

class Luggage extends Compartment{
	public String notice()
	{
		return "Notice:luggage compartment";
	}
	
}

public class TestComp {
public static void main(String[] args) {
	Compartment[] c=new Compartment[10];
	
	    Random rand=new Random();
	    int randomNum=0;
	      for(int i=1;i<10;i++) {
		randomNum=rand.nextInt(4)+1;
		if(randomNum==1)
			c[i]=new FirstCls();
		else if(randomNum==2)
			c[i]=new Ladies();
		else if(randomNum==3)
			c[i]=new General();
		else if(randomNum==4)
			c[i]=new Luggage();
	}
}
}
