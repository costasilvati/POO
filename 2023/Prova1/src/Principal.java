import java.util.*;

public class Principal {
	public static void main(String args[]) {
		Alimento produto1 = new Alimento();
		produto1.setDescricao("Leite UHT");
		Eletronico produto2 = new Eletronico();
		produto2.setEstoque(1);
		produto2.setDescricao("Headset JBL");
		Alimento produto3 = new Alimento();
		produto3.setDescricao("Biscoite recheado");
		
		ArrayList<Produto> lista = new ArrayList<>();
		lista.add(produto1);
		lista.add(produto3);
		Venda venda1 = new Venda();
		venda1.produtos = produto1;
		
	}
}
