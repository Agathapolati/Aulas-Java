
public class Aplicacao {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo();
		
		veiculo.setMarca("Honda");//atribui uma informação para cada atributo
		veiculo.setModelo("City");
		veiculo.setAno(2015);
		
		veiculo.imprimir();//Imprimi os metodos
		veiculo.buzinar();
		
		Carro carro = new Carro();//Criação Objeto
		
		carro.setMarca("Honda");
		carro.setModelo("City");
		carro.setAno(2015);
		carro.setQuatroPortas(true);
		
		System.out.println();
		
		carro.imprimir();
		carro.buzinar();
		
		Caminhao caminhao = new Caminhao();//Criação do objeto Caminhao
		
		caminhao.setMarca("Scania");//atribui uma informação para cada atributo
		caminhao.setModelo("XJT75");
		caminhao.setAno(2022);
		
		System.out.println();
		
		caminhao.imprimir();//imorimi os metodos do caminhai
		caminhao.buzinar();
		
		Moto moto = new Moto();//Criação do Objeto Moto
		
		moto.setMarca("Honda");
		moto.setModelo("Titan");
		moto.setAno(2014);
		
		System.out.println();//Mostra na tela
		
		moto.imprimir(); //Imprimi os metodos 
		moto.buzinar();
		moto.empinar();
		
		
		
		
		
		
		
		
		
		

}

}
