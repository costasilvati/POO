import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n------ POLIMORFISMO com Animais ----- \n");
        // Animal animais[] = new Animal[10];
        ArrayList<Animal> animaisList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String menu = "1 - Cadastrar animais \n" + 
                      "2 - Listar animais \n" + 
                      "3 - Mover Animal \n" + 
                      "4 - Editar Animal \n" +
                      "0 - Sair \n Digite sua opção: \n";
        int option = 0;
        do{
            System.out.println(menu);
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Cadastro de animais");
                    System.out.println("Escolha qual animal deseja cadastrar \n" +
                        "1 - Animal genérico \n"+
                        "2 - Peixe \n" + 
                        "3 - Ave \n ");
                    int tipoAnimal = sc.nextInt();
                    System.out.println("Digite o nome do animal");
                    String nome = sc.next(); // 
                    System.out.println("Digite a quantidade de patas do animal");
                    int patas = sc.nextInt();
                    System.out.println("Digite a velocidade do animal");
                    double velocidade = sc.nextDouble();
                    System.out.println("Digite um valor inteiro de localização");
                    int localizacao = sc.nextInt();
                    // Especificidades
                    switch (tipoAnimal) {
                        case 1:  
                            Animal a = new Animal(nome, patas, velocidade, localizacao);
                            animaisList.add(a); 
                            break;
                        case 2:
                            System.out.println("Digte em qual tipo de água este peixe vive\n"+
                                               "0 - água doce \n1 - água salgada");
                            int agua = sc.nextInt();
                            Peixe p = new Peixe(nome, patas, velocidade, localizacao, agua);
                            animaisList.add(p);
                            break;
                        case 3:
                            Ave ave = new Ave(nome, patas, velocidade, localizacao);
                            animaisList.add(ave);
                        default:
                            break;
                    }
                    System.out.println("Temos "+ animaisList.size() + " animais cadastrados!");     
                    break;
                case 2:
                    System.out.println("Listar Animais");
                    for(Animal animalItem : animaisList){
                        System.out.println(animalItem.toString());
                    }
                    break;
                case 3:
                    System.out.println("Mover Animal");
                    for(Animal a : animaisList){
                        a.mover();
                    }
                    // E Se quisermos mover apenas 1????
                    break;
                case 4:
                    System.out.println("Editar Animal");
                    break;
                case 0:
                    System.out.println("Encerando o sistema!");
                    break;
                default:
                    break;
            }
        }while(option !=0);
        sc.close(); // Enecrra o scanner no fim da aplicação
    }
}
