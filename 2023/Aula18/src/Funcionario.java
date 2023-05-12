
public class Funcionario extends Pessoa implements Autenticavel{
	private int matricula;
	private String cargo;
	
	public Funcionario(String nome, String cpf) {
		super(nome, cpf);
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public boolean login(String id) {
		if(id.equals(getCpf())) {
			return true;
		}else {
			return false;
		}
	}
	
}
