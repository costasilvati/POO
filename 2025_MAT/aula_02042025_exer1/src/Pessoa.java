public class Pessoa {
    private String nome;
    private char genero;
    private int idade;

    public Pessoa(){}
    public Pessoa (String nome, char genero, int idade){
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public char getGenero(){
        return this.genero;
    }
    public void setGenero(char genero){
        this.genero = genero;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public String toString(){
        return "Nome: "+ this.nome + "\nGenero: "+ this.genero + "\nIdade: "+ this.idade; 
    }
}
