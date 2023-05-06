package Zoologico;

public class Local {
	private int numLocal;
	private int setor;
	
	public Local() {
		this.numLocal = 00;
		this.setor = 00;
	}
	
	public Local(int numLocal, int setor) {
		this.numLocal = numLocal;
		this.setor = setor;
	}


	public int getNumLocal() {
		return numLocal;
	}
	public void setNumLocal(int numLocal) {
		this.numLocal = numLocal;
	}
	public int getSetor() {
		return setor;
	}
	public void setSetor(int setor) {
		this.setor = setor;
	}

	@Override
	public String toString() {
		return " LOCALIZAÇÃO: " + numLocal;
	}
	
	
}
