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
//		if (idadePessoa < 18) {   //if: quando tiver mias de uma condi��o, chamada de metodo
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
		
//		for(int x=1; x<10; x++) { // criando  da variavel , tem o começo e fim ( só conseguimos utilizar a variavel criada no "for" , apenas no "for".)
//			System.out.println(x);
//		}
//		
//		for(int x=0; x<10; x++) {
//			System.out.println("2 x " + x + "=" + x*2);
//		}

		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um número qualquer:");
		int y = entrada.nextInt();
		
		for(int x=0; x<10; x++) {
			System.out.println(y + " x " + x + "=" +  x*y);
		}
		
		int x1 = 3;
		int y1 = 5;
		int z1 = 7;
		
		System.out.println(x1);
		System.out.println(y1);
		System.out.println(z1);
		
		double x[] = { 3, 5, 3, 5 }; // Matriz: � a cria�ao da variavel e nessa variavel vai ter varias caixas para guardar essas informa�oes. tem 4 espa�os
		
		for(int aux = 0; aux < x.length; aux++) {
			System.out.println("Valor do imdice " + aux + "=" + x[aux]);
		}
		String nome[] = {"Rafael", "Agatha", "Flavia"}; // determina que a matriz  tem 3 posições 
		
		for (int aux1 = 0; aux1 < nome.length; aux1++) {
			System.out.println(nome[aux1]);
			if (nome[aux1] == "Agatha") {
				System.out.println("O �ndice de Agatha � = " + aux1);
				
			}
		}
		
		int[] arrayInt = new int[5]; // Array= Utilizado quando os objetos que atuam armazenando as variaves
		String[] arrayString = new String[4];
		double[] arraydouble = new double[3];
		
		arrayInt[3] = 4; //Dando o valor 
		
		int[] numero = new int[6]; //construindo o numero 
		Scanner teclado = new Scanner(System.in);// instanciando o objeto
		
		for (int aux2=0; aux2 < numero.length; aux2++) { // length=Tamanho da variavel
			System.out.println("Digite um n�mero qualquer");
			numero[aux2] = teclado.nextInt();
		}
		for (int aux2 = 0; aux2 < numero.length; aux2++) {
			System.out.println("Indice " +aux2+ " = " + numero[aux2]);
		}
		
		int[] arrayQualquer = new int[3]; // Matriz:Agrupa tudo em um lugar s�
		Object[] arrayObject = new Object[6]; // Quando tiver o Object[], consegue colocar qualquer coisa dentro dele 
		
		arrayObject[0] = 12; // Desvantagens de usar o Array: ele n�o muda o tamanho.  
		arrayObject[1] = "Rafael";
		arrayObject[2] = 13.8;
		arrayObject[3] = true; 
		arrayObject[5] = arrayQualquer;
		
		for (int aux2 = 0; aux2 < arrayObject.length; aux2++) {
			System.out.println("Indice " +aux2+ " = " + arrayObject[aux2]);
		}
		
		int[][] arrayBidirecional = new int[4][3]; //Estanciando o objeto , quando tem 2 [][] quer dizer que � Bidirecional. O Primeiro [] � a quantidade de linhas e o Segundo [] quantidade de colunas  
		
		arrayBidirecional[0][0]=8;
		arrayBidirecional[2][1]=7;
		
		for (int linha = 0; linha < arrayBidirecional.length; linha++) { // Variar linha
			for (int coluna = 0; coluna < arrayBidirecional[0].length; coluna++) { // quando tem o int e voc� estabelece um valor sempre o restante vai ser zero, se for outro vai ser nulo. 
				System.out.print("Indice [" +linha+ "]["+coluna +"] = " + arrayBidirecional[linha][coluna]+" " ); // Variar Coluna
			}
			System.out.println();
			
		}
		
	}
}

		
	
	
