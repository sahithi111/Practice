package com.wipro.cls_obj;

class Ex1_co {
	
	double wid,hei,dep;
	Ex1_co()
	{
		wid=dep=hei=1;
	}
	Ex1_co(double wid,double hei,double dep)
	{
		this.wid=wid;
		this.hei=hei;
		this.dep=dep;
	}  
	double volume()
	{
		return wid*dep*hei;
	}
	
	
	public static void main(String[] args) {
		
			Ex1_co b=new Ex1_co();
			Ex1_co b1=new Ex1_co(12,34,15);
			System.out.println(b.volume());
			System.out.println(b1.volume());
			
	}
}		
