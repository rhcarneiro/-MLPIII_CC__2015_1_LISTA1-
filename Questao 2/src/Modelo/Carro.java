package Modelo;

public class Carro {

	String cor, modelo;
	int velocidadeAtual, velocidadeMaxima;
	
	public void acelerar (int aceleracao){
		
		if(aceleracao<=velocidadeMaxima){
			this.velocidadeAtual+=aceleracao;
			System.out.printf("Velocidade Atual: %d \n", velocidadeAtual );
		}
		else
			System.out.println("Velocidade ultrapassada");
	}
	
	public void ligar(){
		
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public String toString(){

	return "velocidade maxima permitida: " + velocidadeMaxima;
	}
		
	
}
