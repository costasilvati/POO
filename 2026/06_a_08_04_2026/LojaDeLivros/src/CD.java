public class CD extends Produto{
    private int faixas;

    public CD(){}

    public CD(String nome, double preco, int faixas){
        super(nome, preco);
        this.faixas = faixas;
    }

    // Getters e setters
    public int getFaixas(){return this.faixas;}
    public void setAutor(int duracao){this.faixas = duracao;}

    // toString
    /* 
    public String toString(){
        return "CD: " +super.toString() + " \t Duração: "+ this.autor;
    }
    */

    public String toString(){
        return "CD: [Nome: " + getNome() 
                    + "\t Preco: "+ getPreco()
                    +" \t Duração "+ this.faixas +"]";
    }
}
