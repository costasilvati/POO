
public class ProdutoImpl implements Produto{
	private String nome;
	private double preco;
	private int quantidade;
	

	public String getNome() {
		return this.nome;
	}

	public double getPreco() {
		return this.preco;
	}

	public int getQuantidade() {
		return this.quantidade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "ProdutoImpl [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}
	
	

}
