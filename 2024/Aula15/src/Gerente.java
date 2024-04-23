// Gerente herda atributos e métodos de Funcionario
public class Gerente extends Funcionario{
	private int senha;
	
	public Gerente(String nome, String cpf) {
		super(nome, cpf); // Envia parametros para a super classe (Funcionario)
	}
	
	public Gerente(String cpf) {
		super(cpf);
	}
	
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autenticar(int senha) {
		boolean auth = false;
		if(senha == this.senha) {
			auth = true;
		}
		return auth;
	}
	
	public double calculaBonificacao() {
		return (getBonificacao() * getSalario()) + (getSalario() * 0.2);
	}
	
	
}
