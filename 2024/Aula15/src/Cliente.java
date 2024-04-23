import java.util.ArrayList;
public class Cliente {
	private String nome;
	private String cpf;
	private String telefone;
	private String celular;
	private String email;
	private String nascimento;
	private String endereco;
	private ArrayList<Conta> contas = new ArrayList<>();
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	// telefone
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	// celular
	public String getCelular() {
		return this.celular;
	}
	
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	//email
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	//nascimento
	public String getNascimento() {
		return this.nascimento;
	}
	
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	
	//endereco
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public ArrayList<Conta> getContas(){
		return contas;
	}
	
	public void setContas(ArrayList<Conta> contas) {
		this.contas = contas;
	}
	
	public String toString() {
		return "Nome: " + this.nome + "\t"
				+ "CPF: " + this.cpf + "\n"
				+ "Telefone: " + this.telefone + "\t"
				+ "Celular: "+ this.celular + "\n"
				+ "Email: "+ this.email + "\t"
				+ "Nascimento: " + this.nascimento + "\n"
				+ "Endereço: " + this.endereco;
	}
}
