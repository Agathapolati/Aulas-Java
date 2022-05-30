
public class Aplicacao {

	public static void main(String[] args) {
		
		Preparador preparador = new Preparador(); // Está Instânciando o preparador
		
		LeiteQuente leiteQuente = new LeiteQuente();// Está Instânciando o Leite quente
		preparador.prepararBebida(leiteQuente);//Chama o leite quente no método de preparar a bebida.
		
		Refrigerante refrigerante = new Refrigerante();// Está Instânciando o Refrigerante
		preparador.prepararBebida(refrigerante); //Chama o Refrigerante no método de preparar a bebida.
		
	}

}