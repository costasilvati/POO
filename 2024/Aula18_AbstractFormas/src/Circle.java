
public class Circle extends Forma2D{
	
	public Circle() {}
	
	public Circle(double x, String nome) {
		super(x, nome);
	}
	

	@Override
	public double area() {
		double raio = super.getAltura()/2;
		return Math.PI * (raio *raio);
	}
	
}
