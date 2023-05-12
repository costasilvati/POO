
public class Retangulo extends Forma2D{
	
	public Retangulo() {}
	
	public Retangulo(double w, double h){
		super(w,h,"retangulo"); //Construtor da superclasse 
	}
	
	public Retangulo(double w){
		super(w,"retangulo"); //Construtor da superclasse 
	}
	
	public double area() {
		return getLargura() * getAltura();
	}
}
