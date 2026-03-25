public class Conta {
    // Atributos da classe
    double saldo;
    String nome;
    int numero;
    double limite;

    public void saque(double valor){
        if(saldo >= valor && valor >0){
            //this.saldo = this.saldo - valor;
            this.saldo -= valor;
            System.out.println("Saque efetuado com sucesso!");
        }else{
            System.out.println("Saldo insuficiente ou valor de saque inválido");
        }
        System.out.println("Seu saldo atual é: "+ this.saldo);
    }

    boolean sacarVerfica(double quantidade){
        if(quantidade > saldo && quantidade <= 0){
            return false;
        }else{
            this.saldo -= quantidade;
            return true;
        }
    }

    // método padrão para visualizar o objeto
    public String toString(){
        return "Nome: "+ this.nome 
                + " | Num.: " + this.numero 
                + " | Saldo: " + this.saldo
                + " | Limite: " + this.limite;
    }

}
