
public class Pessoa {
	
	private String nome;//Criando as classes privadas 
	private int idade;
	private Sexo sexo;
	private	Endereco endereco;

	//o método split quando divide, a primeira parte será 0 e outra será 1.

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
		
		String[] arrayLinha = linha.split(",");// faz split(repartição de variavel) da variavel line a partir da (","),(quebra).
		String[] arrayNome = arrayLinha[0].split("=");//// faz split(repartição de variavel em duas partes) da variavel line a partir do ("=") e guarda na variavel ArrayNome
		this.nome = arrayNome[1].trim();
		
		String[] arrayIdade = arrayLinha[1].split("=");
		this.idade = Integer.parseInt(arrayIdade[1].trim());// Retira os espaços da variavel ArrayIdade e guarda em idade.
		
		String[] arraySexo = arrayLinha[2].split("=");
		this.sexo = Sexo.valueOf(arraySexo[1].trim()); // Retira os espaços da variável ArraySexo e guarda no atributo sexo.
		
		Endereco endereco = new Endereco(arrayLinha);// Instância um ArrayLinha
		this.endereco = endereco;//Um endereço variável é igual ao endereço de atributo
		
	}
	

	@Override
	public String toString() {
		return "Pessoa: nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + endereco ; 

	}

	


}
