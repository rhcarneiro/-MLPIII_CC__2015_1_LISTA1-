package ui;

import Modelo.Carro;

public class Principal {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		carro1.setVelocidadeAtual(30);
		carro1.setVelocidadeMaxima(200);
		carro1.acelerar(80);
		
		System.out.println(carro1);
		
	}

}
