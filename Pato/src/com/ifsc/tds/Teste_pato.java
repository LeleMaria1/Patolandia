package com.ifsc.tds;

public class Teste_pato {

	public static void main(String[] args) {
		Pato patolino = new Pato();
		Pato_Real real = new Pato_Real();
		Pato_Mandarim mandarim = new Pato_Mandarim();
		Pato_Borracha borrachudo = new Pato_Borracha();
		Pato_Madeira carpinteiro = new Pato_Madeira();
	
		patolino.display();
		patolino.nadar();
		System.out.println("-----------------------------");
		real.som();
		real.display();
		real.voa();
		System.out.println("-----------------------------");
		mandarim.som();
		mandarim.display();
		mandarim.voa();
		System.out.println("-----------------------------");
		borrachudo.display();
		borrachudo.nadar();
		System.out.println("-----------------------------");
        carpinteiro.display();
        carpinteiro.nadar();
		

	}

}
