public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n------ POLIMORFISMO com Animais ----- \n");
        Animal animais[] = new Animal[10];
        Animal doguinho = new Animal("Doguinho", 3, 5.5, 0); // Instanciando 1 obj da classe Aniaml

        // Associar objeto a posição do array
        animais[0] = doguinho;
        // Utilizando objeto do um array
        //animais[0].mover();

        animais[1] = new Peixe("Nemo", 1, 0.2, 3, 1);
        // animais[1].mover();
        // FOR EACH
        for(Animal a: animais){
            if(a != null){
                a.mover();
            }
        }
        // Versão clássica do FOR
        /*
        for(int i = 0; i< animais.length;i++){
            if(animais[i] != null){
                animais[i].mover();
            }
        }
        */
        // IMPLEMENTE A CLASSE AVE - ATRIBUTOS IDEM ANIMAL
        // MOVER DIFERENTE

    }
}
