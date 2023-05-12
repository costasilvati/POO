
public class Circle extends Forma2D{
	private final double pi = 3.14;
	
	public Circle() {}

	public Circle(double w) {
		super(w, "Circle");
	}
	
	public double area() {
		double raio = super.getLargura()/2;
		return Math.pow(raio, 2)*pi;
	}
}
