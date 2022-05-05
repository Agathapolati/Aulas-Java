
public class Aplicacao {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo();
		
		veiculo.setMarca("Honda");
		veiculo.setModelo("City");
		veiculo.setAno(2015);
		
		veiculo.imprimir();
		veiculo.buzinar();
		
		Carro carro = new Carro();
		
		carro.setMarca("Honda");
		carro.setModelo("City");
		carro.setAno(2015);
		carro.setQuatroPortas(true);
		
		System.out.println();
		
		carro.imprimir();
		carro.buzinar();
		
		Caminhao caminhao = new Caminhao();
		
		caminhao.setMarca("Scania");
		caminhao.setModelo("XJT75");
		caminhao.setAno(2022);
		
		System.out.println();
		
		caminhao.imprimir();
		caminhao.buzinar();
		
		Moto moto = new Moto();
		
		moto.setMarca("Honda");
		moto.setModelo("Titan");
		moto.setAno(2014);
		
		System.out.println();
		
		moto.imprimir();
		moto.buzinar();
		moto.empinar();
		
		
		
		
		
		
		
		
		
		

}

}
