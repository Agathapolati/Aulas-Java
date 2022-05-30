
public class Preparador {
	
	public void prepararBebida(Bebida bebida) { // Metodo publico que recebe uma Bebida.
		
		System.out.println("Preparando a Bebida " + bebida.getNome());
		
		bebida.preparar();
		
		//para ver se a bebida é quente ou fria;
		if(bebida.isAquecer()) {
				System.out.println("Aquecendo a bebida " + bebida.getNome());
		}
		
		System.out.println("Bebida preparada com sucesso!! \n"); //Mostra na tela, um em baixo do outro.
		
	}
}