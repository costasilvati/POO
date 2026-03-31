public class App {
    public static void main(String[] args) throws Exception {
        // Utilizando construtor CHEIO
        Carro car = new Carro("Fusca", "Azul", "ABC0D12", 2);
        System.out.println(car.toString());
        
        // Utilizando construtor VAZIO
        Carro car2 = new Carro(); 
    }
}
