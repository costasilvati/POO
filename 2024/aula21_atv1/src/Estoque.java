
public interface Estoque {
	public void adicionarProduto(Produto produto);
	public void removerProduto(String nome);
	public Produto getProduto(String nome);
}
