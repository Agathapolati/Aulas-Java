
public class pessoa {
	String nome;
	int numFigurinhas;

	void receber(int numFigurinhas) {
		this.numFigurinhas += numFigurinhas;
	}

	boolean dar(int numFigurinhas, pessoa pessoa) {
		// boolean retorno

		if (this.numFigurinhas < numFigurinhas) {
			System.out.println("A quamtidade de figurinhas não é suficiente para realizar esse método");
			return false;
		}

		else {
			this.numFigurinhas -= numFigurinhas;
			pessoa.receber(numFigurinhas);
			return true;
		}
	}
}