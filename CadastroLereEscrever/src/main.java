import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) throws IOException { // IOEException serve para que se der algum erro ele "mostra" na tela.(se tiver algum erro na leitura ou na escrita ele avisa)
		
		List <Mouse> listaMouse = new ArrayList<Mouse>();
		
		Mouse mouse1 = new Mouse("sim", "5", "Pequeno"); //Criando o primeiro mouse
		listaMouse.add(mouse1);
		
		Mouse mouse2 = new Mouse("sim", "5", "Medio");  //Criando o segundo mouse
		listaMouse.add(mouse2);
		
		Mouse mouse3 = new Mouse("sim", "5", "Grande");  //Criando o primeiro mouse
		listaMouse.add(mouse3);
		
		try(BufferedWriter escrever = new BufferedWriter (new FileWriter("Mouses.txt"))){
			for (Mouse mouse : listaMouse)
				escrever.write(mouse.toString()); //Escrevendo
		}
		
		List <Mouse> listaMouse2 = new ArrayList<Mouse>();
		
		try(BufferedReader reader = new BufferedReader (new FileReader("Mouses.txt"))){ //Lendo
			String line;
			String string = "";
			
			while ((line = reader.readLine()) != null) { //Retorna nulo. While:"Enquanto" então enquanto a condição for verdadeira vai executar.
				string+= line + "\n"; //"\n" pula linha
				Mouse mouse = new Mouse(line);
				listaMouse2.add(mouse);
			}
			
			for (Mouse mouse5 : listaMouse2) { //Vai executar até achar a condição falsa
				System.out.println(mouse5);
			}
			
			
		}
		
		
		
		
		
		
	}

}
