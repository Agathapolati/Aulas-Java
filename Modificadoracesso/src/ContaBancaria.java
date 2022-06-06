
public class ContaBancaria {
	
	private int numConta;
	private boolean ativo;
	private double saldo;
	
	public ContaBancaria() {
		ativo = true;
		saldo = 1.0;
	}
	
	public ContaBancaria(boolean ativo, double saldo) { //Sobrecarga de métodos do Conta bancaria
		this.ativo = ativo;
		this.saldo = saldo;
	}
	
	public void receber(double valor) {//Método que mostra na tela que o usuário acaba de receber um valor
		saldo += valor;
	}
	
	public double saldo() {//Mostra o saldo
		return saldo;
	}
	public void dar(double valor) {
		if(saldo >= valor)
		saldo -= valor;
	}
	

}
