public class App {
    public static void main(String[] args) throws Exception {
        double joao = 1.5; // aumenta 0.02
        double ze = 1.1; // aumenta 0.03
        int contAnos = 0;
        // enquanto ze < joao
        while (ze <= joao) {
            contAnos++;
            ze+=0.03;
            joao+=0.02;
        }
        System.out.println(contAnos + " para Zé atingir " + ze + "metros");
        System.out.println("João tem "+ joao + " metros");
    }
}
