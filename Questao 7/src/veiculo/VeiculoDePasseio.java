package veiculo;

public class VeiculoDePasseio extends Veiculo {
	
	private String ar;
	private int qtdDePortas;
	
public VeiculoDePasseio (String placa, String marca, String modelo, int ano, double kmInicial, double kmFinal, double valorKMrodado){
		this.placa = placa;
		this.marca=marca;
		this.modelo=modelo;
		this.ano=ano;
		this.kmInicial=kmInicial;
		this.kmFinal=kmFinal;
		this.valorKMrodado=valorKMrodado;
	}
	
	public String getAr() {
		return ar;
	}
	public void setAr(String ar) {
		this.ar = ar;
	}
	public int getQtdDePortas() {
		return qtdDePortas;
	}
	public void setQtdDePortas(int qtdDePortas) {
		this.qtdDePortas = qtdDePortas;
	}
	
	public String toString(){
		return "\n\n\n\nplaca: " + placa + "\nmarca: " + marca + "\nmodelo: " + modelo + "\nano: " + ano + "\nKM inicial: " + kmInicial + "\nkmFinal: " + kmFinal + "\nvalor KM Rodado: " + valorKMrodado + "\n Valor da Locacao: " + getValorLocacao();
	}

}
