
public class Main {
	public static void main(String args[]) {
		ProdutoImpl prod1 = new ProdutoImpl();
		prod1.setNome("Biscoito Salgado");
		prod1.setPreco(5.9);
		prod1.setQuantidade(10);
		
		ProdutoImpl prod2 = new ProdutoImpl();
		prod2.setNome("Biscoito Doce");
		prod2.setPreco(3.9);
		prod2.setQuantidade(9);
		
		EstoqueImpl estoque1 = new EstoqueImpl();
		
		estoque1.adicionarProduto(prod1);
		estoque1.adicionarProduto(prod2);
		// Exibe estoque 1
		estoque1.exibeEstoque();
		
		// Testando nome repetido
		ProdutoImpl prod3 = new ProdutoImpl();
		prod3.setNome("Biscoito Salgado");
		prod3.setPreco(5.9);
		prod3.setQuantidade(10);
		estoque1.adicionarProduto(prod3);
		
		estoque1.removerProduto("Biscoito Doce");
		estoque1.exibeEstoque();
	}

}
