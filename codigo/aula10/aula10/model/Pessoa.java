package poo.aula10.model;

/**
 *
 * @author costasilvati
 */
public class Pessoa {
    private int id;
    private String nome;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa \n"  
                + "Id:" + id 
                + "\n Nome:" + nome 
                + "\n E-mail=" + email;
    }
    
    
    
}
