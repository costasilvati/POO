public class Ave extends Animal{
    
    public void mover(){
        setLocalizacao(getLocalizacao() + 3);
        System.out.println("Ave: "+ getNome() + " movendo-se ^^ v ^^ -->");
    }
}
