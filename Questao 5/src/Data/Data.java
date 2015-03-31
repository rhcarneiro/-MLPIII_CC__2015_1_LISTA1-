package Data;
 

public class Data {

	private int dia;  
	private int mes;  
	private int ano;   
	
	
	public int getDia() {
		return dia;
	}


	public void setDia(int dia){
		this.dia = dia;
	}


	public int getMes() {
		return mes;
	}


	public void setMes(int mes) {
		
		this.mes = mes;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}

	public Data(){
		
	}
	
	public Data(int dia, int mes, int ano) {   
		this.dia = dia;   
		this.mes = mes;   
		this.ano = ano; 
	}
	
	public String toString() { 
		String data= dia + "/" + mes + "/" + ano;
		if(dia>30 || dia<1 || mes>12 || mes<1){
			data=data + " (data invalida)";
		}
		return data; 
	}
}
