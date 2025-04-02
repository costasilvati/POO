public class Animal{
    private String nome;
    private float peso;
    private int recinto;
    // Construtores
    public Animal(String nome, int recinto){
        this.nome = nome;
        this.recinto = recinto;
    }
    public Animal(){}
    // Getters and Setters
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public int getRecinto() {
        return recinto;
    }
    public void setRecinto(int recinto) {
        this.recinto = recinto;
    }
    @Override
    public String toString() {
        return "Animal [nome=" + nome +  ", peso=" + peso + 
                ", recinto=" + recinto + "]";
    }
}
/*
 * 
 */