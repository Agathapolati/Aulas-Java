
public class Ferrari implements Automovel, ItemCaro{ // N�o esquecer de implementar , pode ter mais de uma implementa��o(como o item caro)

	@Override
	public void virarEsquerda() {
		System.out.println("Ferrari virou a esquerda");	
	}

	@Override
	public void virarDireita() {
		System.out.println("Ferrari virou a Direita");	
	}

	@Override
	public void acelerar() {
		System.out.println("Ferrari acelerou");
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return 500000;
	} 
	
	
	
	
	

}
