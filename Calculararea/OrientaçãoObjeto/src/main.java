
public class main {

	public static void main(String[] args) {
	   
	   pessoa pessoa1 = new pessoa(); //Criando a variavel e instanciando o objeto pessoa
	   
	   pessoa1.nome = "Agatha";
	   pessoa1.numFigurinhas = 1;
	   
	   pessoa1.receber(3);
	   
	   System.out.println(pessoa1.nome);
	   System.out.println(pessoa1.numFigurinhas);
	   
	   pessoa pessoa2 = new pessoa();
	   
	   pessoa2.nome = "Matheus";
	   pessoa2.numFigurinhas = 3;
	   
	   System.out.println(pessoa2.nome);
	   System.out.println(pessoa2.numFigurinhas);
	   
	   boolean retorno = pessoa1.dar(4, pessoa2);
	   
	   if (retorno == true) {
		   System.out.println("depois");
		   
		   System.out.println(pessoa1.nome);
		   System.out.println(pessoa1.numFigurinhas);
		   
		   System.out.println(pessoa2.nome);
		   System.out.println(pessoa2.numFigurinhas);
		   
		   
	   }
   }
}
