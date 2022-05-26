import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;


public class main {

	public static void main(String[] args) throws IOException {
		
		String s = "TEXTOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO";
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("Saida.txt"))){
			escrever.write(s);
		}
		//instanciando o objeto Mouse
		Mouse mouse1 = new Mouse(true, 2, "pequeno");
		Mouse mouse2 = new Mouse(false, 4, "Médio");
		Mouse mouse3 = new Mouse(true, 2, "Grande");
		
		List<Mouse> listaDeMouse = new ArrayList<Mouse>(); // Criando uma lista de mouses, com 3 objetos.

		listaDeMouse.add(mouse1); 
		listaDeMouse.add(mouse2);
		listaDeMouse.add(mouse3);
		
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("Saida.txt"))){
			for (Mouse mouse : listaDeMouse)
			escrever.write(mouse.toString()); // Ele escreve. toString : manda o conteudo do objeto e o syso  mostra no console.
		}
		
		
	
		
		
		
		

	}

}
