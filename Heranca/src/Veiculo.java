
public class Veiculo {
	
	private String nome; //Variavel do veiculo
	protected String marca;
	protected String modelo;
	protected int ano;
	
	public void buzinar( ) { //Criação de metodo
		System.out.println("BI BI");
	}
	
	public void imprimir() { //Criação de metodo
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);
	}
	
	public String getNome() { //Recebe o valor e retorna ele mesmo
		return nome;
	}

	public void setNome(String nome) {//Modifica o valor da variavel e coloca em uma nova variavel que ja esta instanciada
		this.nome = nome;
	}

	public String getMarca() {//Recebe o valor e retorna ele mesmo
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {//Recebe o valor e retorna ele mesmo
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {//Recebe o valor e retorna ele mesmo
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}


	
	
	
	
	
	
	

}
