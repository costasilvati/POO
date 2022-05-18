
public class Pessoa {
    private Long id;
    private String nome;
    private String email;
    
    public Pessoa(String nome){
        this.nome = nome;
    }
    
    public Long getId(){
        return this.id;
    }
    
    public void setId(Long id){
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
    
    public String toString(){
        return " --- Pessoa " + this.id + "---\n"
                + "Nome: " + this.nome + "\n"
                + "E-mail: " + this.email;
    }
    
    
}
