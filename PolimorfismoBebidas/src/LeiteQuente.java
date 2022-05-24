
public class LeiteQuente extends Bebida {

	//Construtor da bebida.
		public  LeiteQuente () {
			//chama o construtor da superclasse
			super ( "Leite Quente" , true );

		}

		//Sobreescreve o método preparar.
		@ Substituir
		public  void  Preparar () {
			super . Preparar ();
			Sistema . fora . println ( "Colocando o leite." );
			Sistema . fora . println ( "Colocando açúcar." );
		}

}
