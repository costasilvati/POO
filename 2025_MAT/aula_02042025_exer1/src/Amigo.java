public class Amigo extends Pessoa{
    private String dataAniversario;

    public Amigo(){}
    public Amigo(String nome, char genero, int idade, String dataAniversario){
        super(nome, genero, idade);
        this.dataAniversario = dataAniversario;
    }

    public String getDataAniversario(){
        return this.dataAniversario;
    }
    public void setDataAniversario(String dataAniversario){
        this.dataAniversario = dataAniversario;
    }

    public String toString(){
        return super.toString() + "\nData Aniversário: "+ this.dataAniversario;
    }
}
