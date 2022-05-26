
public class Mouse {
	private String funciona;
	private String qtdBotoes;
	private String tamanho;// Para Conseguir Ler Precisamos do Getters and Setters pois é  uma Classe Privada.
	public Mouse(String funciona, String qtdBotoes, String tamanho) {
		super();
		this.funciona = funciona;
		this.qtdBotoes = qtdBotoes;
		this.tamanho = tamanho;
	}
	public String isFunciona() {
		return funciona;
	}
	public void setFunciona(String funciona) {
		this.funciona = funciona;
	}
	public String getQtdBotoes() {
		return qtdBotoes;
	}
	public void setQtdBotoes(String qtdBotoes) {
		this.qtdBotoes = qtdBotoes;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	@Override
	public String toString() {
		return "Mouse: funciona=" + funciona + ", qtdBotoes=" + qtdBotoes + ", tamanho=" + tamanho + "\n"; // "\n " serve para pular linha.
	} 
	   public Mouse(String texto) {
		   
		   String[] arrayAuxiliar1 = texto.split(" , ");
		   String[] arrayAuxiliar2 =  arrayAuxiliar1[0].split("="); //Split:Quando ele encontra a "," ele quebra em duas Strings.
		   this.funciona = arrayAuxiliar2[1].trim(); // Trim:Espaço em branco ele joga fora.
		   
		   String[] arrayAuxiliar3 = arrayAuxiliar1[1].split("="); //Quebra o =.
		   this.qtdBotoes = arrayAuxiliar3[1].trim();
		   
		   String[] arrayAuxiliar4 = arrayAuxiliar1[2].split("=");
		   this.tamanho = arrayAuxiliar4[1].trim(); // O "Trim" vai tirar o \n.
		     
				   
	   }
	

}
