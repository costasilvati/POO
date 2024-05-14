
public class Retangulo extends Forma2D{
	
	public Retangulo() {
		super();
	}
	
	public Retangulo(double w, double h) {
		super(w, h, "Retangulo");
	}
	
	public Retangulo(double x) {
		super(x, "Retangulo");
	}
	
	public double area() {
		return getLargura() * getAltura();
	}
}
