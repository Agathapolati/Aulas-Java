
public class Pessoa {
   nome da string  privada ;
	 idade int  privada ;
	particular 	Endereco  endereco ;
	privado  Sexo  sexo ;
	
	
	
	// <------------------------------Getter e Setter-------------- ------------------------->
	public  String  getNome () {
		retornar  nome ;
	}

	public  void  setNome ( String  nome ) {
		isso . nome = nome ;
	}

	public  int  getIdade () {
		retornar  idade ;
	}

	public  void  setIdade ( int  idade ) {
		isso . idade = idade ;
	}

	

	public  Endereco  getEndereco () {
		retornar  endereco ;
	}
	
	public  void  setEndereco ( Endereco  endereco ) {
		isso . endereco = endereco ;
	}
	
	
	public  Sexo  getSexo () {
		retornar  sexo ;
	}

	public  void  setSexo ( Sexo  sexo ) {
		isso . sexo = sexo ;
	}

	
	// <------------------------------Getter e Setter-------------- ------------------------->
	
	

	@ Substituir
	public  String  toString () {
		return  "Pessoa [nome = " + nome + ", Idade = " + idade + ", endereco = " + endereco + " ,sexo = " + sexo + "]" ;
	}

}
