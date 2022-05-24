
Preparador de classe  pública {

	//Classe de passagem
	
	//metodo publico que recebe uma bebida
	
	public  void  prepararBebida ( Bebida  bebida ) {
		Sistema . fora . println ( "Preparando a bebida" + bebida . getNome ()+ "..." );
		
		bebida . Preparar ();
		
		if ( bebida . isAquecer ()) {
			Sistema . fora . println ( "Aquecendo a bebida" + bebida . getNome ()+ "..." );
		}
		senão {
			Sistema . fora . println ( "Esfriando a bebida" + bebida . getNome ()+ "..." );
		}
	Sistema . fora . println ( "Bebida pronta." );
	Sistema . fora . println ( "---------------------------------------------------------- --------------------------------" );
	}
	
}