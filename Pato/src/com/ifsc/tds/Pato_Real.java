package com.ifsc.tds;

public class Pato_Real extends Pato implements Voar, Emitir_Som{
	
	  public void display() {
		  System.out.println("Oi, eu sou um pato Real!");
		 
	  }
	  
	  public void nadar() {
		  //não nada
	  }
	  
	  @Override
	  public void som() {
		  System.out.println("Quack!Quack!Quack!");
		
	  }

	  @Override
	  public void voa() {
		  System.out.println("Estou voando!");
		
	  }
}
