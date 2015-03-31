package veiculo;

public class Veiculo {

	protected String placa;
	protected String marca;
	protected String modelo;
	protected int ano;
	protected double valorKMrodado;
	protected double kmInicial;
	protected double kmFinal;
	protected double valorLocacao;
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getValorKMrodado() {
		return valorKMrodado;
	}
	public void setValorKMrodado(double valorKMrodado) {
		this.valorKMrodado = valorKMrodado;
	}
	public double getKmInicial() {
		return kmInicial;
	}
	public void setKmInicial(double kmInicial) {
		this.kmInicial = kmInicial;
	}
	public double getKmFinal() {
		return kmFinal;
	}
	public void setKmFinal(double kmFinal) {
		this.kmFinal = kmFinal;
	}
	public double getValorLocacao() {
		valorLocacao = (kmFinal - kmInicial) * valorKMrodado;
		return valorLocacao;
	}
	public void setValorLocacao(double valorLocacao) {
		this.valorLocacao = valorLocacao;
		
	}
	
	
	
}
