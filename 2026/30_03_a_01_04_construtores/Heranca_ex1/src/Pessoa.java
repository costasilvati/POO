public class Pessoa {
    private String nome;
    private String genero;
    private int idade;

    public Pessoa(){}
    public Pessoa(String nome, String genero, int idade){
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    @Override
    public String toString() {
        return "Pessoa [nome=" + this.nome + ", genero=" + this.genero + ", idade=" + this.idade + "]";
    }

    

}
