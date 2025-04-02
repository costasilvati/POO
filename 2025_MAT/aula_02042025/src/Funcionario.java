public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String cpf){
        this.cpf = cpf;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String cpf){ // Validar CPF??
        this.cpf = cpf;
    }
    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    // getBonificacao
    public double getBonificacao(){
        return this.salario * 0.1;
    }
    // Visualizar estado do objeto
    public String toString(){
        return "\n------ Funcionario ----- \n"+
               "Nome: "+ this.nome + "\n"+
               "CPF: " + this.cpf + "\n" +
               "Salário: " + this.salario + "\n" + 
               "Bonificação: " + this.getBonificacao(); 
    }
}
