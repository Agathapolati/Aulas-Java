import java.util.Objects;//Importa um objeto

public class Cliente {
	// Atributos privados do cliente
	private String nome;
	private int cpf;
	private int numConta;
	
	public Cliente() {

	}
	// <----------------------------------------------- --Getters e setters--------------------------------------------- >
	// Get pega o valor do atributo e set coloca um valor para o atributo

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
 //Override do toString, método que retorna todos os atributos e mostra no console
	@Override
	public String toString() {
		return "Cliente: \nNome = " + nome + ", \nCPF = " + cpf + ", \nNúmero da Conta = " + numConta + "";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome, numConta);
	}

	@Override //Metodo que esta comparando dois objetos.
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return cpf == other.cpf && Objects.equals(nome, other.nome) && numConta == other.numConta;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
