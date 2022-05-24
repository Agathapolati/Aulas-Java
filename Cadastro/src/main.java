
importar  java . útil . ListaMatriz ;
importar  java . útil . Lista ;
importar  java . útil . Scanner ;


 classe  pública Principal {

	public  static  void  main ( String [] args ) {
	
		List < Pessoa > listaPessoas = new  ArrayList < Pessoa >();
		
		 Teclado do scanner =   novo  Scanner ( System . in );
		Pessoa  pessoa = nova  Pessoa ();
		
		Sexo  sexo = Sexo . MASCULINO ;

		
		pessoa . setEndereco ( novo  Endereco ());
		
		for ( int   x = 0 ;   x < 4 ; x ++) {
		
		Sistema . fora . println ( "Digite seu nome: " );
		pessoa . setNome ( teclado . próximo ());
		
		Sistema . fora . println ( "Digite sua idade: " );
		pessoa . setIdade ( teclado . nextInt ());
		
		Sistema . fora . println ( "Digite a rua do seu endereço" );
		pessoa . getEndereco (). setRua ( teclado . próximo ());
		
		
		Sistema . fora . println ( "Digite o numero do seu endereço" );
		pessoa . getEndereco (). setNumero ( teclado . nextInt ());
		
		Sistema . fora . println ( "Digite o bairro do seu endereço" );
		pessoa . getEndereco (). setBairro ( teclado . próximo ());
		
		Sistema . fora . println ( "Digite 1 para o sexo Masculino e Digite 2 para o sexo feminino" );
		
		
		if ( teclado . nextInt () == 1 ) {
			 sexo = sexo . MASCULINO ;
		}
		senão {
			 sexo = sexo . FEMININO ;
		}
		
		listaPessoas . adicionar ( pessoa );
		}
		Sistema . fora . println ( listaPessoas );
	}

}
