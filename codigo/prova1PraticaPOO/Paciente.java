package admpaicentes;

/**
 *
 * @author costasilvati
 */
public class Paciente {
    String nome;
    String caso;
    double altura;
    
    @Override
    public String toString(){
        return " - Nome: " + this.nome + 
                "\n - Caso: " + this.caso + 
                "\n - Altura: " + this.altura;
    }
    
}
