import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"))){ // BufferedReader:Chama os metodos de outra aplica��o como o Main
			String line;
			String string = "";
			
			// While:usasse pois n�o sabemos a quantidade de linhas que vamos utilizar.
			while((line = reader.readLine())!= null) { //read line : leitura. Null: se a linha tiver vazia ele sai fora, n�o retorna nada.
				string += line + "\n"; //+= peguei o valor e somei com o valor que ja estava dentro, vai colocar embaixo e pular a linha com o "\n".
			}
			System.out.println(string); //syso para mostar o falor da string 
	}
		
		
		
		

	}

}
