
public class App {
    public static void main(String[] args) throws Exception {
        //Forma2D novaForma = new Forma2D(6.5, 5.0, "retangulo"); // Não pode instanciar classes abstratas
        Triangulo trianguloRetangulo = new Triangulo(5.0,"Triangulo", "retangulo");
        // Usando a implementação do método abstrato area() da superclasse
        System.out.println(trianguloRetangulo.area());

        Retangulo retangulo = new Retangulo(4.0);
        // Usando a implementação do método abstrato area() da superclasse
        System.out.println(retangulo.area());
    }
}
