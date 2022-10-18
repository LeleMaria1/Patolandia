package com.ifsc.tds;

public class Pato_Borracha extends Pato implements Voar, Emitir_Som{
	
	public void display() {
		  System.out.println("Oi, eu sou um pato de borracha!");
		 
	  }

	public void nadar() {
		  System.out.println("Estou boiando!");
	  }


	@Override
	public void quack() {
	
	}


	@Override
	public void voa() {
		
	} 
	
	
	  
}
