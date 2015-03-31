package Fatura;

public class Fatura {
	private String numero,descricao;
	private int quant;	
	private double preco;	

	public Fatura(String numero, String descricao, int quant, double preco) {
		this.numero = numero;
		this.descricao=descricao;
		this.quant = quant;
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if(preco < 0)
			this.preco = 0;
		else this.preco = preco;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		if(quant < 0)
			this.quant = 0;
		else this.quant = quant;
	}
	
	public double getValorFatura(){
		return quant*preco;
	}
	
	public String toString(){
		return "Numero: " + this.numero + "\nDescricao: " + this.descricao + "\nPreco: " + this.preco + "\nQuantidade: " + this.quant + "\nTotal a ser pago: " + getValorFatura();
	}
}
