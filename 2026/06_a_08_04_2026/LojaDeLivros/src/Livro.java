public class Livro extends Produto{
    private String autor;

    public Livro(){}

    public Livro(String nome, double preco, String autor){
        super(nome, preco);
        this.autor = autor;
    }

    // Getters e setters
    public String getAutor(){return this.autor;}
    public void setAutor(String autor){this.autor = autor;}

    // toString
    /* 
    public String toString(){
        return "Livro: " +super.toString() + " \t Autor: "+ this.autor;
    }
    */

    public String toString(){
        return "Livro: [Nome: " + getNome() 
                    + "\t Preco: "+ getPreco()
                    +" \t Autor "+ this.autor +"]";
    }
}
