public class Peixe extends Animal{
    private int agua;

    public Peixe(){}

    public Peixe(String nome, int patas, double velocidade, int localizacao, int agua){
        super(nome, patas, velocidade, localizacao); // Atributos da super classe Animal
        this.agua = agua; // Atributo da classe peixe
    }

    public int getAgua(){return this.agua;}
    public void setAgua(int agua){this.agua = agua;}

    public void mover(){
        System.out.println("Peixe "+ getNome() +" movendo ~ ~ ~ ~ >" );
        int localAtual = getLocalizacao();
        localAtual += 2;
        super.setLocalizacao(localAtual);
        // super.setLocalizacao(super.getLocalizacao() + 2); // versão compacta
    }

    /*
    DECLARE UM OBJ PEIXE NA MAIN E ASSOCIE ELE AO ARRAY DE ANIAMAIS,
     -  CHAME O MÉTODO MOVER
    */
}
