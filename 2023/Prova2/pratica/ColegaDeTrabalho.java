package pratica;

public class ColegaDeTrabalho extends Contato{
	
	public ColegaDeTrabalho(String nome, String email, String telefone) {
		super(nome, email, telefone);
	}

	@Override
	public String assinatura(String nome) {
		return "Atenciosamente \n"+
				nome + "\n "+
				"Ramal 3678";
	}
	
}
