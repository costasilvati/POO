package aula22;

public class Pessoa implements Comparable<Pessoa>{
	private String nome;
	private String cpf;
	private String nascimento;
	
	public Pessoa() {}
	
	public Pessoa(String nome, String cpf, String nascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.nascimento = nascimento;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", nascimento=" + nascimento + "]\n";
	}
	@Override // Define o campo compravel do obj
	public int compareTo(Pessoa p) {
		return this.nome.compareTo(p.nome);
	}
	
	
}
