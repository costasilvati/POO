
public class GeradorDeFormas {
	public static void main(String args[]) {
		Triangulo triangulo = new Triangulo("Novo", 15.0, 7.0);
		// Triangulo triangulo2 = new Triangulo();
		System.out.println("A área do triangulo é " + triangulo.area());
		
		Retangulo retangulo = new Retangulo(3.0, 3.0);
		System.out.println("A área do retangulo é "+ retangulo.area());
		
		Desenhista d = new Desenhista();
		d.setAnoNasc(2001);
		d.setNome("Marcos");
		System.out.println("A idade do " + d.getNome() + " é " + d.calcularIdade(2023));
		
		// Final em atributo torna a variável uma constante
		final double ICMS = 18;
		
		Circle circle = new Circle(10.0);
		System.out.println("A área do círculo é "+ circle.area());
		
	}
}
