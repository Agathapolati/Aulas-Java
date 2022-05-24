
public  class  Refrigerante  estende  Bebida {
	
	//Construtor da bebida.
	público  Refrigerante () {
		//chama o construtor da superclasse
		super ( "Refrigerante" , false );

	}

	//Sobreescreve o método preparar.
	@ Substituir
	public  void  Preparar () {
		super . Preparar ();
		Sistema . fora . println ( "Colocando o Refrigerante." );
	}
	
	
	
}