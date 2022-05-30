
public class LeiteQuente extends Bebida{

	public LeiteQuente() { //Costrutor da Bebida.
		super("Leite Quente", true); //Está chamando o construtor da superclasse.
		
	}

	@Override // Faz o Override para subscreever o metodo preparar.
	public void preparar() { //Metodo preparar
		super.preparar();
		System.out.println("Colocando o leite no copo");
	}
	
	

}