
public class Carro extends Veiculo{ // esta extendendo os atributos da classe veiculo
	
	private boolean quatroPortas; // quantidade de portas

	@Override // subscreve o metodo
	public void imprimir() {
		super.imprimir();
		System.out.println("Tem 4 Portas: " + quatroPortas);
	}

	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}
	
	
	
	

}
