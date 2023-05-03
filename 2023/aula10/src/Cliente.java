import java.util.ArrayList;
import java.util.Calendar;

public class Cliente {
	private String nome;
	private String cpf;
	private String endereco;
	private Calendar nascimento;
	private ArrayList<Conta> contas = new ArrayList<>();
	// Construtor da Classe
	public Cliente() {
		nascimento = Calendar.getInstance();
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
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Calendar getNascimento() {
		return nascimento;
	}
	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}

	public ArrayList<Conta> getContas() {
		return contas;
	}

	public void setContas(ArrayList<Conta> contas) {
		this.contas = contas;
	}
	
	public String addConta(Conta conta) {
		if(contas.contains(conta)) {
			return "Conta já esta cadastrada";
		}else {
			contas.add(conta);
			return "Conta cadastrada com sucesso";
		}
	}
	
	public boolean equals(Object conta) { 
	    if (this.nome == ((Conta) conta).getNumeroConta()){
	         return true; 
	    } 
	    return false; 
	}

	public String toString() {
		return "nome:" + nome + 
				"\t cpf:" + cpf + 
				"\t endereco:" + endereco + 
				"\t nascimento=" + nascimento;
	}

}
