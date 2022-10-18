package com.ifsc.tds;

public class Pato{
	Voar voa;
	Emitir_Som quack;
	
	public Pato() {}
	 
    public void display() {
	    System.out.println("Oi, eu sou um pato!");
	    System.out.println("Estou testando o GitHub!");
	 
    }
  
    public void nadar() {
	    System.out.println("Estou nadando!");
       }
    
    public void setVoa(Voar voa) {
    	this.voa = voa;
    }
    
    public void Emitir_Som(Emitir_Som quack) {
    	this.quack = quack;
    }
    
    
}
