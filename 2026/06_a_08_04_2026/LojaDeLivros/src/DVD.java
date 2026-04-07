public class DVD extends Produto{
    private int duracao;

    public DVD(){}

    public DVD(String nome, double preco, int duracao){
        super(nome, preco);
        this.duracao = duracao;
    }

    // Getters e setters
    public int getDuracao(){return this.duracao;}
    public void setAutor(int duracao){this.duracao = duracao;}

    // toString
    /* 
    public String toString(){
        return "CD: " +super.toString() + " \t Duração: "+ this.autor;
    }
    */

    public String toString(){
        return "DVD: [Nome: " + getNome() 
                    + "\t Preco: "+ getPreco()
                    +" \t Duração "+ this.duracao +"]";
    }
}
