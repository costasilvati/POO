public class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;
    
    // construtor
    public Cliente(){}
    
    public Cliente(String nome, String sobrenome, String cpf){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }
    // getters e setters
    public String getNome(){return this.nome;}
    public void setNome(String nome){this.nome = nome;}
    public String getSobrenome(){return this.sobrenome;}
    public void setSobrenome(String sobrenome){this.sobrenome = sobrenome;}
    public String getCpf(){return this.cpf;}
    public void setCpf(String cpf){this.cpf = cpf;}

    public String toString(){
        return "--- Cliente --- \n"
               +"Nome: "+this.nome + " " + this.sobrenome 
               +"\tCPF: "+ this.cpf;
    }
}
