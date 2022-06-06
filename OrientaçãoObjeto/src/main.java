
public class main {
	
   public static void main(String[] args) {
	   
	   pessoa pessoa1 = new pessoa(); //Criando a variavel e instanciando o objeto pessoa
	   
	   pessoa1.nome = "Agatha";
	   pessoa1.numFigurinhas = 1;
	   
	   pessoa1.receber(3); //recebe o 3
	   
	   
	   System.out.println(pessoa1.nome); //Mostrando as informções na tela
	   System.out.println(pessoa1.numFigurinhas);
   }
}
