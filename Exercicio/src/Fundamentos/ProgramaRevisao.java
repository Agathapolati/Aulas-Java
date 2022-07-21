package Fundamentos;

public class ProgramaRevisao {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario();
		funcionario1.nome = "Agatha";
		funcionario1.salario = 1235.0;
		System.out.println("Agatha: Recepcionista, salario: 1235,00 ");
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.nome = "Matheus";
		funcionario1.salario = 1237.0;
		System.out.println("Matheus: Operador, salario: 1237.0 ");
		System.out.println("A diferenca do salario de recepcionista para operador e de: "+(1235-1237));

	}

}
