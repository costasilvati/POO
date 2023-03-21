package aula7;
//Nome da classe igual ao do arquivo
public class Produto {
	// atributos da classe
	String nome;
	double preco;
	int quantidade;
	
	//métodos da classe
	public double calculaDesconto() {
		double desconto = 0.0;
		if(this.quantidade > 10 && this.quantidade <= 20) {
			desconto = (this.quantidade * this.preco) * 0.9;
		}
		return desconto;
	}
	
}
