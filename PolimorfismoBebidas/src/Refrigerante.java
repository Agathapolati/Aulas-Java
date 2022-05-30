
public class Refrigerante extends Bebida {

	public Refrigerante() { //Construtor da bebida
		super("Refrigerante", false);//Está chamando o construtor da super classe.	
	}

	@Override //Está subscreevendo o método preparar.
	public void preparar() {
		super.preparar();
		System.out.println("Colocando gelo no copo");
		System.out.println("Colocando o refrigerante no copo");
	}
}