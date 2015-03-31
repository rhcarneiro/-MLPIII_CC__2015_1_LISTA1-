package ui;

import veiculo.VeiculoDeCarga;
import veiculo.VeiculoDePasseio;

public class Principal {

	public static void main(String[] args) {
	
		VeiculoDeCarga veiculo1 = new VeiculoDeCarga ("MOC - 1668", "Ford", "F5000", 2009, 10, 13, 20);
		VeiculoDePasseio veiculo2 = new VeiculoDePasseio("MUO - 1678", "Land Rover", "Discovery 4", 2015, 20, 30, 10);

		
		System.out.println(veiculo1);
		System.out.println(veiculo2);
	}

}
