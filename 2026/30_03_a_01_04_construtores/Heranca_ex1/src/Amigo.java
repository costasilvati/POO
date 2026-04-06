public class Amigo extends Pessoa{
    private String diaDoAniversario;

    public Amigo(String nome, String genero, int idade, String diaDoAniversario){
        super(nome, genero, idade);
        this.diaDoAniversario = diaDoAniversario;
    }

    public String getDiaDoAniversario() {
        return diaDoAniversario;
    }

    public void setDiaDoAniversario(String diaDoAniversario) {
        this.diaDoAniversario = diaDoAniversario;
    }

    @Override
    public String toString() {
        return "Amigo [diaDoAniversario=" + diaDoAniversario + "]";
    }

}
