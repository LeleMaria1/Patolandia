package com.ifsc.tds;

public class Teste_pato {

	public static void main(String[] args) {
		Pato patolino = new Pato();
		Pato_Real real = new Pato_Real();
		Pato_Mandarim mandarim = new Pato_Mandarim();
		Pato_Borracha borrachudo = new Pato_Borracha();
		Pato_Madeira carpinteiro = new Pato_Madeira();
	
		System.out.println("------------Patolino------------");		
		patolino.display();
		patolino.nadar();
		System.out.println("\n----------Pato Real-------------");
		real.quack();
		real.display();
		real.voa();
		System.out.println("\n---------Pato Mandarim----------");
		mandarim.quack();
		mandarim.display();
		mandarim.voa();
		System.out.println("\n------Pato de Borracha----------");
		borrachudo.quack();
		borrachudo.display();
		borrachudo.nadar();
		System.out.println("\n------Pato de Madeira-----------");
        carpinteiro.display();
        carpinteiro.nadar();
		

	}

}
