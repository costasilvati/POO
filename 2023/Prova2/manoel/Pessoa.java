package manoel;

public class Pessoa {
	private String nome;
	private String endereco;
	
	public Pessoa (String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public String toString() {
		String retorno = "";
		for(int i=0; i < nome.length(); i++) {
			retorno = nome + i;
		}
		return retorno;
	}
}
