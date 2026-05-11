public class Triangulo extends Forma2D {
    private String style;
    // Construtor padrao
    Triangulo() {
        super();
        style = "nada";
    }
    // Construtor para Triangulo.
    Triangulo(String s, double w, double h) {
        super(w, h, "triangulo");
        style = s;
    }
    // Construtor para lados iguais
    public Triangulo (double x, String nome, String style){
        super(x, nome);
        this.style = style;
    }
    // Get e set
    public String getStyle() {
        return style;
    }
    public void setStyle(String style) {
        this.style = style;
    }
    // Implementar métodos abstratos
    public double area(){
        return (getAltura() * getLargura()) /2;
    }
    
    @Override
    public String toString() {
        return "Triangulo [style:" + style 
                + ", Altura:" + getAltura() 
                + ", Largura:" + getLargura()
                + ", Nome:" + getNome() + "]";
    }
}
