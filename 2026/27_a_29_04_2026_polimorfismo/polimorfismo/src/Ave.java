public class Ave extends Animal{

    public Ave(){}

    public Ave(String nome, int patas, double velocidade, int localizacao) {
        super(nome, patas, velocidade, localizacao);
    }
    
    public void mover(){
        setLocalizacao(getLocalizacao() + 3);
        System.out.println("Ave: "+ getNome() + " movendo-se ^^ v ^^ -->");
    }

    @Override
    public String toString() {
        return "Ave [Nome: " + getNome() + ","+
                ", Patas: " + getPatas() + "," +
                ", Velocidade: "+ getVelocidade() + ","+
                ", Localizacao: " + getLocalizacao() + "]";
    }

}
