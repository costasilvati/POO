package aula7;

public class Sistema {
	public static void main(String args[]) {
		System.out.println("Olá!");
		Produto objeto1 = new Produto();
		objeto1.nome = "Cerveja";
		objeto1.preco = 3.99;
		objeto1.quantidade = 12;
		
		Produto objeto2 = new Produto();
		objeto2.nome = "Espetinho";
		objeto2.preco = 6.00;
		objeto2.quantidade = 2;
		System.out.println("O produto "+ objeto2.nome
				 + " recebeu desconto de R$" + objeto2.calculaDesconto());
		
	}
}
