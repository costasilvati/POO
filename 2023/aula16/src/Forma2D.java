
public abstract class Forma2D {
	private double altura;
	private double largura;
	private String nome;
	
	public Forma2D() {
		this.largura = this.altura = 0.0;
		this.nome = "nada";
	}
	
	public Forma2D (double w, double h, String n) {
		this.largura = w;
		this.altura = h;
		this.nome = n;
	}
	
	public Forma2D(double w, String n) {
		this.largura = w;
		this.nome = n;
	}
	
	public double getLargura() { return largura; } 
	public double getAltura() { return altura; } 
	public String getNome() {return nome;}
	public void setLargura(double w) { largura = w; } 
	public void setAltura(double h) {altura = h;} 
	public void setNome(String n){nome = n;}
	// final em métodos proibe a sobrescrita pelas classes que extends Forma2D
	final public void showDim() {
		System.out.println("Largura e Altura: " +
							this.largura +" e " + this.altura );
	}
	
	public abstract double area();
}
