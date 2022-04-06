import javax.swing.JOptionPane;

public class Conta {
  public String numero;
  public String agencia;
  public double saldo;
  public String pix;
  public String titular;
  
  public void sacar(double valor) { 
    if(this.saldo >= valor){
      saldo -= valor;
    }else if(valor > 0.0) {
      JOptionPane.showMessageDialog(null,
          "Seu saldo é " + this.saldo + 
          " o valor do saque deve ser menor ou igual");
    }else {
      JOptionPane.showMessageDialog(null,
          "Valor deve ser maior que 0.0");
    }
  }

  public void exibirDados() {
    System.out.println(" ---- Dados da Conta ----");
    System.out.println("Número: " + this.numero + "\n"
            + "Agencia: " + this.agencia + "\n"
            + "Saldo: " + this.saldo + "\n"
            + "Chave PIX: " + this.pix + "\n"
            + "Titular: " + this.titular);
  }
  
  public void preencherDados(String numero) {
    this.numero = numero;
    this.agencia = JOptionPane.showInputDialog(null,
        "Digite o número da agencia");
    this.pix = JOptionPane.showInputDialog(null,
        "Digite a chave PIX");
    this.titular = JOptionPane.showInputDialog(null,
        "Digite o nome do titular");
  }
  
}
