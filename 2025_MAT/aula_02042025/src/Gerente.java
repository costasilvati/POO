public class Gerente extends Funcionario{ // herda (Gerente é subclasse de Funcionario)
    private String senha;

    public Gerente(String cpf, String senha){
        super(cpf); // Envia cpf para o construtor da super classe Funcionario
        this.senha = senha;
    }

    public String getSenha(){
        return this.senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }

    // sobrescrita getBonificacao
    public double getBonificacao(){
        return super.getSalario() * 0.2;
    }

    public String toString(){
        return super.toString()+ "\n" + 
        "Senha: " + this.senha;
    }
}
