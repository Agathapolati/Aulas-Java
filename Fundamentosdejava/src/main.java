import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
//		int x = 100;
//		double y = 200.3;
//		int a = 0;
//		double b = 0;
//		short z = (short) 10000;
//		System.out.println(z);
//		
//		a = (int) y;
//		b= x; // casting implicito: passa o conteudo da variavel para outra variavel sem perder o seu conteudo.
//		System.out.println(a);
//		System.out.println(b);
//		
//		int idadePessoa = 61;
//		
//		if (idadePessoa < 18) {   //if: quando tiver mias de uma condi��o
//			System.out.println("Voc� n�o pode beber");
//		}
//		else if(idadePessoa < 60) {
//			System.out.println("Bora tomar uma");
//		}else {
//			System.out.println("quanto � a sua aposentadoria?");
//		}
//		
//		System.out.println("Voc� tem " + idadePessoa + " anos");
//		
//		int num = 8;
//		
//		switch (num) {  // switch: testar o conteudo da variavel  
//		case 1:
//			System.out.println("Domingo");
//			break;
//		case 2:
//			System.out.println("Segunda");
//			break;
//		case 3:
//			System.out.println("Ter�a");
//			break;
//		case 4:
//			System.out.println("Quarta");
//			break;
//		case 5:
//			System.out.println("Quinta");
//			break;
//		case 6:
//			System.out.println("Sexta");
//			break;
//		case 7:
//			System.out.println("Sabado");
//			break;
//		default:
//			System.out.println("Esse numero n�o representa um dia da semana!");
//		}
		
//		char caractere = 'c';
//
//		switch (caractere) {
//		case 'a':
//			System.out.println("Seu caractere � a");
//			break;
//		case 'b':
//			System.out.println("Seu caractere � b");
//			break;
//		default:
//			System.out.println("Valor inv�lido");
//		}
		
//		String farol = "vermelho";
//
//		switch (farol) {  // Switch � escolha
//		case "vermelho":
//			System.out.println("Pare!!!");
//			break;
//		case "amarelo":
//			System.out.println("Aten��o!!!");
//			break;
//		case "verde":
//			System.out.println("Siga!!!");
//			break;
//		default:
//			System.out.println("valor inv�lido");
//		}
		
//		int x = 0;
//		while (x < 10) {         // O while testa primeiro depois executa.(enquanto) 
//			System.out.println(x);
//			x = x + 1;
//		}
//
//		x = 0;
//		do {
//			System.out.println(x); // do while: sempre ele vai executar e depois testar 
//			x = x + 1;
//		} while (x < 10);
		
//		System.out.println("teste "+ x);
		
//		for(int x=1; x<10; x++) { // cria��o da variavel , tem o come�o e fim ( s� conseguimos utilizar a variavel criada no "for" , apenas no "for".)
//			System.out.println(x);
//		}
//		
//		for(int x=0; x<10; x++) {
//			System.out.println("2 x " + x + "=" + x*2);
//		}

		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um n�mero qualquer:");
		int y = entrada.nextInt();
		
		for(int x=0; x<10; x++) {
			System.out.println(y + " x " + x + "=" +  x*y);
		}
		
	}
}
