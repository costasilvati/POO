
public class Triangulo extends Forma2D{
	private String style;
	
	public Triangulo() {
		super();
		style = "void";
	}
	
	public Triangulo (double w, double h, String s) {
		super(w, h, "Triangulo");
		this.style = s;
	}

	public String getStyle() {return style;}
	public void setStyle(String style) {this.style = style;}

	public double area() {
		return (getLargura() * getAltura())/2;
	}
	
}
