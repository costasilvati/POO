package controller;
import model.Pessoa;
import model.PessoaDao;

public class PessoaController {
	// Regra de negócio de Pessoa
	public boolean addPessoa(String nome, String email) {
		if(nome != null && nome.length() > 3) {
			// Se for válido
			// limpa espaços 
			// new Pessoa
			// envia para DAO
			Pessoa p = new Pessoa(nome, email);
			PessoaDao pdao = new PessoaDao();
			pdao.inserirPessoa(p);
			return true;
		}
		return false;
	}
}
