/*
Crie uma hierarquia de classes de domínio para uma loja que venda livros,
CDs e DVDs. Sobrescreva o método toString() para que imprima:
• Para livros: nome, preço e autor;
• Para CDs: nome, preço e número de faixas;
• Para DVDs: nome, preço e duração.
Evite ao máximo repetição de código utilizando a palavra super no
construtor e no método sobrescrito. Em seguida, crie uma classe Loja- com o
método main() que adicione 5 produtos diferentes (a sua escolha) a um vetor
e, por fim, imprima o conteúdo do vetor.
*/

public class App {
    public static void main(String[] args) throws Exception {
        Produto caneta = new Produto("Caneta", 5.9);
        System.out.println(caneta.toString());
        Livro l1 = new Livro("O senhor dos Anéis", 69.9, "J. R. R. Tolkien");
        System.out.println(l1.toString());

        Produto produtos[] = new Produto[5];
        produtos[0] = new Livro("Bíblia", 49.9, "Deus");

    }
}
