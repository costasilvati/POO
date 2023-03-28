package aula9;

public class Agencia {
	String cidade;
	String numAg;
	Funcionario funcAg;
	
	public String toString() {
		return "Cidade " + this.cidade +
				"Numero " + this.numAg + 
				"\n Funcionario "+ this.funcAg.toString();
	}
}
