public class Produto {
    private String nome;
    private double preco;

    //Construtores
    public Produto(){}

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    // Getters e setters
    public String getNome(){return this.nome;}
    public void setNome(String nome){this.nome = nome;}

    public double getPreco(){return this.preco;}
    public void setPreco(double preco){this.preco = preco;}

    public String toString(){
        return "[Nome: " + this.nome + "\t Preco: "+ this.preco+"]";
    }
}
