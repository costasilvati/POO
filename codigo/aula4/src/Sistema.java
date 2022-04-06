
public class Sistema {

  public static void main(String args[]) {
    Conta c1 = new Conta(); // instanciar um objeto
    c1.numero = "12345-0";
    c1.agencia = "1555";
    c1.saldo = 1000.00;
    c1.pix = "email@email.com";
    c1.titular = "Juliana Costa"; 
    
    c1.exibirDados();
    c1.sacar(15000.00);
    c1.exibirDados();
    // Fazer outro objeto e imprimir dados
     
    // ----------
    
    /*
     * Conta conta3 = new Conta();
     * conta3.preencherDados("123456");
     */

  }

}
