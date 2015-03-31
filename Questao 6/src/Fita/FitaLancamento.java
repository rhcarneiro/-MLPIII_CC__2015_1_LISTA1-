package Fita;

public class FitaLancamento extends Fita {
	
	public FitaLancamento(float preco, String titulo) {
		precoFita(preco);
		this.titulo=titulo;
	}

	public void precoFita(float preco){
		this.preco=preco + (0.20f*preco);
		}
	
	public String toString(){
		return "Fita Lancamento: " + getPreco() ;
	}
}
