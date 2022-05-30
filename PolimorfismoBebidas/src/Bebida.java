
public class Bebida {
	private String nome;
	private boolean aquecer;
	
	//Construindo a Bebida.
	public Bebida(String nome, boolean aquecer) {
		super();
		this.nome = nome;
		this.aquecer = aquecer;
	}
	
	public void preparar() { //Metodo publico,sem retorno,com o nome preparar.
		System.out.println("Pegando o copo");
	}

     //GETTERS AND SETTERS
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public boolean isAquecer() {
		return aquecer;
	}


	public void setAquecer(boolean aquecer) {
		this.aquecer = aquecer;
	}
	
	
	
}
