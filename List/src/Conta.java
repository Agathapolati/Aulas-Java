
public class Conta {
	String nome;
	double valor;

	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", valor= R$ " + valor + "]";
	}

	public Conta(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;

	}
 
}


