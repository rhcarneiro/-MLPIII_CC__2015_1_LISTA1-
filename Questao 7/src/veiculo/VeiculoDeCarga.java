package veiculo;

public class VeiculoDeCarga extends Veiculo {
	

	private double capacidadeDeCarga;
	
	public VeiculoDeCarga (String placa, String marca, String modelo, int ano, double kmInicial, double kmFinal, double valorKMrodado){
		this.placa = placa;
		this.marca=marca;
		this.modelo=modelo;
		this.ano=ano;
		this.kmInicial=kmInicial;
		this.kmFinal=kmFinal;
		this.valorKMrodado=valorKMrodado;
		
	}

	public double getCapacidadeDeCarga() {
		return capacidadeDeCarga;
	}

	public void setCapacidadeDeCarga(double capacidadeDeCarga) {
		this.capacidadeDeCarga = capacidadeDeCarga;
	}
	
	public String toString(){
		return "placa: " + placa + "\nmarca: " + marca + "\nmodelo: " + modelo + "\nano: " + ano + "\nKM inicial: " + kmInicial + "\nkmFinal: " + kmFinal + "\nvalor KM Rodado: " + valorKMrodado + "\n Valor da Locacao: " + getValorLocacao();
	}
	
}
