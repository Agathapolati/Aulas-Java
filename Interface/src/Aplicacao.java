
public class Aplicacao {

	public static void main(String[] args) {
		
		Rota rota = new Rota(); // Cria��o Objeto
		Ferrari ferrari = new Ferrari(); //Cria��o Objeto 
//		Fusca fusca = new Fusca();
//		rota.ir(ferrari);
//		System.out.println();
//		rota.ir(fusca);
//		 
//		Automovel automovel = new Ferrari(); //Polimorfismo 
//		rota.ir(automovel);
//		automovel = new Fusca(); //Estanciando o Fusca
//		rota.ir(automovel);
		
		Vendedor vendedor = new Vendedor();
		Apartamento apartamento = new Apartamento();
		
		vendedor.mostrarPreco(apartamento);
		vendedor.mostrarPreco(ferrari);
		
		 
	

	}

}
