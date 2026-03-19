public class App {
    public static void main(String[] args) throws Exception {
        Conta minhaConta; // declaração
        minhaConta = new Conta(); // instanciação
        minhaConta.nome = "Juliana";
        // executar o método saque
        minhaConta.saque(100);

        Conta minhaConta2 = new Conta();
        minhaConta2.nome = "José";
        minhaConta2.saldo = 1000.9;
        minhaConta2.numero = 23;
        minhaConta2.saque(100);
    }
}
