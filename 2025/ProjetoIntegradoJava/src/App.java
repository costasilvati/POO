import controller.SistemaController;
import view.MenuView;

public class App {
    public static void main(String[] args) {
        SistemaController controller = new SistemaController();
        MenuView menu = new MenuView(controller);
        menu.exibirMenuPrincipal();
    }
}