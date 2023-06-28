package pratica;

public class Generica extends Contato{
	
	public Generica(String nome, String email, String telefone) {
		super(nome, email, telefone);
	}

	@Override
	public String assinatura(String nome) {
		return "Att., \n" + 
				nome + "\n"
				+ "Gerente de compras \n"
				+ "jorge.silva@compras.br \n"
				+ "Fone: (43) 3400-8729";
	}
	
}
