public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--- Sistema bancário ---- \n");
        Cliente cliente1 = new Cliente("Juliana", "Costa Silva", "0000");
        Conta conta1 = new Conta(0.0, 1000.9, cliente1);
        Conta conta2 = new Conta();

        System.out.println(conta1.toString());
        System.out.println(conta1.getCliente().getNome());
        System.out.println(conta2.toString());
        System.out.println(cliente1.toString());
    }   
}
