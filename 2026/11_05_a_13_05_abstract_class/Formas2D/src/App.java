import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Forma2D> listaFormas = new ArrayList<>();
        int option  = 0;
        MenuFormas menuFormas = new MenuFormas();
        do{
            option = menuFormas.exibirMenu();
            switch (option) {
                case 1:
                    listaFormas.add(menuFormas.cadastraForma2D());
                    break;
                case 2: // Listar formas
                    for (Forma2D forma2d : listaFormas) {
                        System.out.println(forma2d.toString());
                    }
                    break;
                case 3: // Calcular área
                    for (Forma2D forma2d : listaFormas) {
                        System.out.println("Área da Forma " + forma2d.getNome() + 
                                        ": " + forma2d.area());
                    }
                    break;
                default:
                    break;
            }
        }while(option != 0);
        menuFormas.encerraSistema(); // encerra o scanner
    }
}
