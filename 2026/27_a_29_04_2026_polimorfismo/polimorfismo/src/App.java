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
        View objView = new View();
        do{
            System.out.println(menu);
            option = sc.nextInt();
            switch (option) {
                case 1:
                    Animal temp = objView.cadastraAnimal();
                    if(temp != null){
                        animaisList.add(temp);
                    }
                    System.out.println("Temos "+ animaisList.size() + " animais cadastrados!");     
                    break;
                case 2:
                    System.out.println("Listar Animais");
                    for(Animal animalItem : animaisList){
                        System.out.println(animalItem.toString());
                    }
                    break;
                case 3: // MOVER
                    System.out.println("---- Mover Animal --- \n");
                    int cont = 1; // número p/ print
                    for(Animal a : animaisList){
                        System.out.println(cont + " - " + a.toString());
                        cont++;
                    }
                    System.out.println("--------------- \n "+
                                    "Digite o número do animal que deseja mover");
                    int codAnimal = sc.nextInt();
                    animaisList.get(codAnimal-1).mover();
                    break;
                case 4:
                    System.out.println("\n---- Editar Animal ---- \n");
                    cont = 1; // número p/ print
                    for(Animal a : animaisList){
                        System.out.println(cont + " - " + a.toString());
                        cont++;
                    }
                    System.out.println("--------------- \n "+
                                    "Digite o número do animal que deseja EDITAR");
                    codAnimal = sc.nextInt();
                    Animal tempAnimal = animaisList.get(codAnimal-1);
                    // Leia os dados editáveis -- IDEM a linhas do case 1
                    System.out.println("Nome atual: "+ tempAnimal.getNome()+
                                        " \n Digite o NOVO nome do animal, ou ENTER para manter");
                    nome = sc.next();
                    System.out.println("Patas atual: "+tempAnimal.getPatas() 
                        +"\nDigite a NOVA quantidade de patas do animal, ou 0 para manter");
                    patas = sc.nextInt();
                    System.out.println("Velocidade atual "+tempAnimal.getVelocidade()
                                        +"\nDigite a NOVA velocidade do animal, ou 0 para manter");
                    velocidade = sc.nextDouble();
                    System.out.println("Localização atual: "+tempAnimal.getLocalizacao()
                                    +"\nDigite um valor inteiro de localização");
                    localizacao = sc.nextInt();
                    // Especificidades
                    if(tempAnimal instanceof Peixe){
                        System.out.println("O tipo de água atual é: "+ ((Peixe)tempAnimal).getAgua()
                                        +"\n Digite o NOVO tipo de água, ou -1 para manter");
                                    //+(((Peixe)tempAnimal).getAgua() == 1? "salgada":"doce"));
                        int agua = sc.nextInt();
                        ((Peixe)tempAnimal).setAgua(agua != -1? agua: ((Peixe)tempAnimal).getAgua());
                    }
                    // As validações com operador ternário podem ser substituidas por 
                    // validações no método set de cada atributo (depende da regra de negócio)
                    tempAnimal.setNome(nome.length() >1 ?nome:tempAnimal.getNome());
                    tempAnimal.setPatas(patas != 0? patas: tempAnimal.getPatas());
                    tempAnimal.setLocalizacao(localizacao != 0? localizacao: tempAnimal.getLocalizacao());
                    tempAnimal.setVelocidade(velocidade != 0.0?velocidade:tempAnimal.getVelocidade());
                    break;
                case 5: // DELETAR    
                break; // Esolhe o animal e faz //animaisList.remove(codAnimal);
                
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
