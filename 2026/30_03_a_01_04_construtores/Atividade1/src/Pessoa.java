/*
Crie a classe Pessoa (defina os atributos que achar necessário). Para essa
classe, os atributos devem ser privados. Criem também os métodos de
acesso aos atributos e também um método que imprime os dados da
pessoa. Crie também uma outra classe com um método principal, que
instancia um objeto da classe Pessoa, atribui valores aos atributos e acessa
os seus métodos.
*/

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Pessoa {
    private String nome;
    private Calendar nascimento;
    private String cpf;
    private String telefone;
    private String email;

    //public Pessoa(){}

    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    // métodos de acesso GET e SET
    public String getNome(){return this.nome;}
    public void setNome(String nome) {this.nome = nome; }
    
    public Calendar getNascimento(){return this.nascimento;}
    public void setNascimento(Calendar nascimento) {this.nascimento = nascimento; }
    
    public String getCpf(){return this.cpf;}
    public void setCpf(String cpf) {this.cpf = cpf; }
    
    public String getTelefone(){return this.telefone;}
    public void setTelefone(String telefone) {this.telefone = telefone; }
    
    public String getEmail(){return this.email;}
    public void setEmail(String email) {this.email = email; }

    // To String
    public String toString(){
        // Define padrão para impressão
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        // Format the Date object into a String
        String formattedDate = sdf.format(this.nascimento);
        return "Pessoa - "
               +"\t Nome: " + this.nome
               +"\t Nascimento: "+ formattedDate
               +"\t CPF: "+ this.cpf
               +"\t Telefone: "+this.telefone
               +"\t E-mail: "+ this.email;
    }
}
