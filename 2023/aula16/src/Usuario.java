
public class Usuario {
	private int id;
	private String nome;
	private int anoNasc;
	
	
	// final em métodos proibe a sobrescrita pelas classes que extends Forma2D
	final public int calcularIdade(int anoAtual) {
		return anoAtual - this.anoNasc;
	}

	public int calcularIdade(int anoAtual, String nome) {
		return anoAtual - this.anoNasc;
	}
	
	public int getId() {
		return id;
	}

	/*public void setId(int id) {
		this.id = id;
	}*/

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNasc() {
		return anoNasc;
	}

	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}
	
	
}
