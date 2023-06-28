package pratica;

public class Amigo extends Contato {
	
	public Amigo(String nome, String email, String telefone) {
		super(nome, email, telefone);
	}

	@Override
	public String assinatura(String nome) {
		return "[ ] \n "+ nome;
	}
	

}
