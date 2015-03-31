package Fita;

public class FItaInfantil extends Fita {
	
	public FItaInfantil(float preco, String titulo) {
		precoFita(preco);
		this.titulo=titulo;
	}

	public void precoFita(float preco){
		this.preco = preco - (0.4f * preco);
		}

	public String toString(){
		return "Fita Infantil: " + getPreco() ;
	}
}
