
public class Pessoa {
	
	private String nome;//Criando as classes privadas 
	private int idade;
	private Sexo sexo;
	private	Endereco endereco;

	

	// <------------------------------Getter e Setter--------------------------------------->
	public String getNome() { //Usando o Getter e Setter
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	

	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public Pessoa() {	
	}
	public Pessoa(String linha) {
		
		String[] arrayLinha = linha.split(",");
		String[] arrayNome = arrayLinha[0].split("=");
		this.nome = arrayNome[1].trim();
		
		String[] arrayIdade = arrayLinha[1].split("=");
		this.idade = Integer.parseInt(arrayIdade[1].trim());
		
		String[] arraySexo = arrayLinha[2].split("=");
		this.sexo = Sexo.valueOf(arraySexo[1].trim());
		
		Endereco endereco = new Endereco(arrayLinha);
		this.endereco = endereco;
		
	}
	

	@Override
	public String toString() {
		return "Pessoa: nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + endereco ; 

	}

	


}