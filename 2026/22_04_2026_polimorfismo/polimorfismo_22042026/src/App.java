public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n------ POLIMORFISMO com Animais ----- \n");
        Animal animais[] = new Animal[10];
        Animal doguinho = new Animal("Doguinho", 3, 5.5, 0); // Instanciando 1 obj da classe Aniaml

        animais[1] = new Peixe("Nemo", 1, 0.2, 0, 0);
        // IMPLEMENTE o MENU DA APLICAÇÃO
        /* 
        1 - Cadastrar animais
        2 - Listar animais
        3 - Mover Animal
            - qual animal deseja mover?
        4 - Editar Animail    
            - qual animal deseja editar?
        0 - Sair
        */
        

    }
}
