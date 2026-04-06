
public class App {
    public static void main(String[] args) throws Exception {
        Amigo amigo = new Amigo("João da Silva", "M", 18, "20/03");
        Pessoa pessoa = new Pessoa("Maria José", "F", 28);

        System.out.println(pessoa.toString());
        System.out.println(amigo.toString());
    }
}
