package ui;

import Fita.FItaInfantil;
import Fita.Fita;
import Fita.FitaLancamento;

public class Principal {

	public static void main(String[] args) {
	
		Fita fita1 = new FitaLancamento(10f, "Star Wars");
		
		Fita fita2 = new FItaInfantil(10f, "Senhor dos Aneis");
		
		System.out.println(fita1);
		System.out.println(fita2);
	}

}
