package com.wipro.encap_abstra;

public class Ex1_ea {

	String name,email;
	char gender;
	Ex1_ea(String name,String email,char gender)
	{
		name="abcde";
		email="abc\"sssss\"de@gmail.com";
		gender='f';
	}
	 public String getName() {
	      return name;
	   }

	   public char getGender() {
	      return gender;
	   }
	 
	   public String getEmail() {
	      return email;
	   }
	 
	   public void setEmail(String email) {
	      this.email = email;
	   }
	   
	   public static void main(String[] args) {
		Book b=new Book();
	}
	 
}
class Book{
	String namei;
	double pricei;
	int qtyi;
	String authori;
	
	Book(String name,double price,int qty,String author){
		namei=name;
		pricei=price;
		qty=6;
		author="RK Narayan";
		
		
	}
	public String getName() {
	      return name;
	   }
	 
	   public String getAuthor() {
	      return author; 
	   }
	 
	   public double getPrice() {
	      return price;
	   }
	  
	   p
	   
	      ublic void setPrice(double price) {
	      this.price = price;
	   }
	  	   public int getQty() {
	      return qty;
	   }
	  
	   public void setQty(int qty) {
	      this.qty = qty;
	   }
	 
}

