
public class Endereco {
	
	private String rua;
	private int numero;
	private String bairro;
	
	
	public Endereco(String[] arrayLinha) { //Criando o Construtor
		String[] arrayRua = arrayLinha[3].split("=");
		this.rua = arrayRua[1].trim();
		
		String[] arrayNumero = arrayLinha[4].split("=");
		this.rua = arrayRua[1].trim();
		
		String[] arrayBairro = arrayLinha[5].split("=");
		this.rua = arrayBairro[1].trim();
	}
	
	

	public Endereco() {
		
	}
		
		
		
	@Override
	public String toString() {
		return ", Endereco: rua=" + rua + ", numero=" + numero + ", bairro=" + bairro ;
	}


	
	
	public String getRua() {
		return rua;
	}
	
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	
	public int getNumero() {
		return numero;
	}
	
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	public String getBairro() {
		return bairro;
	}
	
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
}