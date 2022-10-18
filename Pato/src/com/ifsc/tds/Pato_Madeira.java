package com.ifsc.tds;

public class Pato_Madeira extends Pato implements Voar, Emitir_Som{
	
	public void display() {
		  System.out.println("Oi, eu sou um pato de madeira!");
		 
	  }
	
	public void nadar() {
		  System.out.println("Estou afundando!");
	  }
	

	 @Override
	 public void quack() {
		
		
	}

	  @Override
	  public void voa() {
		
	  }


}
