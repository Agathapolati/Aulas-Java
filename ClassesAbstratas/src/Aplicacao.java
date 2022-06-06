
public class Aplicacao {

	public static void main(String[] args) {
		// Item item = new Item();  //não pode criar uma instancia de uma classe abtrata
		
			Item item = new Cogumelo();  //criou a variável
			item.pegar();
			
			item = new Moeda();      //variável é criada(Moeda), não precisa repetir o nome da classe (Item).
			item.pegar();
			
			item = new Diamante(); // Variável criada (Diamante)
			item.pegar();

	}

}
