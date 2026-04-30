import java.util.Scanner;

public class View {

    public Animal cadastraAnimal() {
        Scanner sc = new Scanner(System.in);
        // Todo o código que estava no case 1
        System.out.println("Cadastro de animais");
        System.out.println("Escolha qual animal deseja cadastrar \n" +
                "1 - Animal genérico \n" +
                "2 - Peixe \n" +
                "3 - Ave \n ");
        int tipoAnimal = sc.nextInt();
        System.out.println("Digite o nome do animal");
        String nome = sc.next(); 
        System.out.println("Digite a quantidade de patas do animal");
        int patas = sc.nextInt();
        System.out.println("Digite a velocidade do animal");
        double velocidade = sc.nextDouble();
        System.out.println("Digite um valor inteiro de localização");
        int localizacao = sc.nextInt();
        // Especificidades
        Animal generico = null; // obj sem new
        switch (tipoAnimal) {
            case 1:
                generico = new Animal(nome, patas, velocidade, localizacao);
                break;
            case 2:
                System.out.println("Digte em qual tipo de água este peixe vive\n" +
                        "0 - água doce \n1 - água salgada");
                int agua = sc.nextInt();
                generico = new Peixe(nome, patas, velocidade, localizacao, agua);
                break;
            case 3:
                generico = new Ave(nome, patas, velocidade, localizacao);
                break;
            default:
                break;
        }
        sc.close();
        return generico;
    }

}
