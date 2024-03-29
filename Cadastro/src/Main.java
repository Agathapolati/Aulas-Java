
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();//Criando uma lista

		Scanner teclado = new Scanner(System.in);//Instânciandi um scanner

		for (int x = 0; x < 4; x++) {

			Pessoa pessoa = new Pessoa();//Instância pessoa
			pessoa.setEndereco(new Endereco());

			System.out.println("Digite seu nome: ");
			pessoa.setNome(teclado.next());

			System.out.println("Digite sua idade: ");
			pessoa.setIdade(teclado.nextInt());
			
			System.out.println("Sexo:");
			System.out.println("masculino = 1 ou feminino = 2");
			int opcao =0;
			while (opcao != 1 && opcao != 2) {
				opcao = teclado.nextInt();
				if (opcao == 2)
					pessoa.setSexo(Sexo.FEMININO);
				
				else if(opcao==1)
				pessoa.setSexo(Sexo.MASCULINO);
				else {
					System.out.println("Errado,n�o existe esse tipo de Sexo.Digite novamente!");
					System.out.println("Masculino = 1 ou Feminino = 2");
				}
			}

			System.out.println("Digite a Rua do seu endere�o:");
			pessoa.getEndereco().setRua(teclado.next());// pega o endereço e marque a rua dentro dele com uma instância de teclado

			System.out.println("Digite o N�mero do seu endere�o:");
			pessoa.getEndereco().setNumero(teclado.nextInt());

			System.out.println("Digite o Bairro do seu endere�o:");
			pessoa.getEndereco().setBairro(teclado.next());
			
			listaPessoas.add(pessoa);
		}
		//Para gravar no Escrever TXT
		
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("Saida.txt"))){
			for (Pessoa pessoa : listaPessoas)
			escrever.write(pessoa.toString());// Ele escreve. toString : manda o conteudo do objeto e o syso  mostra no console.
		}
		
		}
	List<Pessoa> ListaPessoas2 = new ArrayList<Pessoa>() {// Cria uma nova lista de pessoa com o nome ListaPessoas2.

	try (BufferedReader reader = new BufferedReader(new FileReader("saida.txt"))) { // Escreve um txt com o nome "Pessoas.txt"
		String line;

		while ((line = reader.readLine()) != null) { // Enquanto uma linha não estiver vazia, ele ira ler o txt
			Pessoa pessoa = new Pessoa(line);// Instância uma pessoa

			ListaPessoas2.add(pessoa);// Adiciona a pessoa criada a lista.
		}

	}
	
	System.out.println(ListaPessoas2);{ //Mostra a informação no console
}


}
