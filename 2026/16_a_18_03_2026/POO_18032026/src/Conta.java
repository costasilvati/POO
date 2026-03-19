public class Conta {
    int numero;
    String nome;
    double saldo;
    double limite;

    //Método
    void saque(double valor){
        //this.saldo = this.saldo - valor;
        this.saldo -= valor;
        System.out.println("O novo saldo é: "+ this.saldo);
    }

} // Fechar as chaves
