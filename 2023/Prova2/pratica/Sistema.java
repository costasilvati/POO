package pratica;
import java.util.ArrayList;

public class Sistema {
	public static void main(String args[]) {
		ArrayList<Contato> contatos = new ArrayList<>();
		contatos.add(new Amigo("Maria Joaquina", "maria@email.com", "4355445544"));
		contatos.add(new ColegaDeTrabalho("Joaqum", "joca@email.com", "4355445544"));
		contatos.add(new Generica("Matheus Souza", "ma@email.com", "4355443"));
		for(Contato c : contatos) {
			System.out.println(c.assinatura("Jorge Silva"));
			System.out.println("-----------\n");
		}
	}

}
