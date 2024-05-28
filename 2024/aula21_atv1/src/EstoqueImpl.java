import java.util.ArrayList;

public class EstoqueImpl implements Estoque {
	ArrayList<Produto> produtos = new ArrayList<>();

	public void adicionarProduto(Produto produto) {
		boolean repetido = false;
		for(Produto p : produtos) {
			String nome = p.getNome();
			if(nome.equals(produto.getNome())) {
				repetido = true;
			}
		}
		if(!repetido) {
			produtos.add(produto);
		}else {
			System.out.println("Nome de produto "+produto.getNome()
								+" já esta cadastrado!");
		}
	}

	@Override
	public void removerProduto(String nome) {
		for(int i = 0; i < produtos.size(); i++) {
			Produto p = produtos.get(i);
			if(p.getNome().equals(nome)) {
				produtos.remove(i);
			}
		}
	}

	@Override
	public Produto getProduto(String nome) {
		for(Produto p : produtos) {
			if(p.getNome().equals(nome)) {
				return p;
			}
		}
		return null;
	}
	
	public void exibeEstoque() {
		System.out.println("Produtos no estoque1 \n ");
		for(Produto p: produtos) {					
			System.out.println(p.toString());
		}
	}

}
