import javax.swing.JOptionPane;

public abstract class Forma2D {
	private double largura;
	private double altura;
	private String nome;
	
	public abstract double area();
	
	//Construtor vazio
	public Forma2D() {
		this.largura = this.altura = 0.0;
		this.nome = "nada";
	}
	
	// Construtor parametrizado
	public Forma2D(double w, double h, String n) {
		this.nome = n;
		this.setAltura(h);
		this.setLargura(w);
	}
	
	// Construtor altura == largura
	public Forma2D(double x, String n) {
		this.largura = this.altura = x;
		this.nome = n;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		if(largura > 0) {
			this.largura = largura;
		}else {
			JOptionPane.showMessageDialog(null, "Largura não foi editada! \n"
					+ "O valor deve ser maior que 0.0");
		}
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if(altura > 0) {
			this.altura = altura;
		}else {
			JOptionPane.showMessageDialog(null, "Altura não foi editada! \n"
					+ "O valor deve ser maior que 0.0");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Forma2D \n largura="+ largura + 
				"\n altura=" + altura 
				+ "\n nome=" + nome;
	}
	
	

}
