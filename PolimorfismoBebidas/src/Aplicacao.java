
public  class  Aplicação {

	public  static  void  main ( String [] args ) {

			//Instância o preparador
		Preparador  preparador = novo  Preparador ();
		
		//Instância o leite quente
		LeiteQuente  leiteQuente = new  LeiteQuente ();
		
		//Chama o leite quente no método preparar bebida.
		preparador . prepararBebida ( leiteQuente );
		
		//Instância o refrescante
		Refrigerante  Refrigerante = novo  Refrigerante ();
		
		preparador . prepararBebida ( refrescante );

	}

}
}