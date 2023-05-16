import java.util.ArrayList;

public class Pedido {
	private int numeroPedido;
	private int mesa;
	private ArrayList<Produto> produtos;
	
	public int getNumeroPedido() {
		return numeroPedido;
	}
	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	public int getMesa() {
		return mesa;
	}
	public void setMesa(int mesa) {
		this.mesa = mesa;
	}
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
	
	public void addProduto(Produto p) {
		produtos.add(p);
	}
	
	public void confirmarPedido() {
		for(Produto p: produtos) {
			if(p instanceof Preparavel) {
				((Preparavel) p).fabricar();
			}else{
				System.out.println("Seu pedido de " + p.getNome()+ 
						" foi encaminhado ao balcão");
			}	
		}
	}
	
	public void fecharPedido() {
		String menssagem = "A conta da mesa " + this.mesa + "é: \n";
		double total = 0;
		for(Produto p: produtos) {
			menssagem = menssagem + p.getNome() + "R$ " + p.getValor()+ "\n";
			total += p.getValor();
		}
		System.out.println(menssagem +"Total: " +total);
	}
	
	@Override
	public String toString() {
		return "Pedido [numeroPedido=" + numeroPedido + ", mesa=" + mesa + ", produtos=" + produtos + "]";
	}
	
}
