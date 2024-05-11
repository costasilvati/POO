
public class Animal {
	private String nome;
	private int	patas;
	private double velocidade;
	private double localizacao;
	
	public Animal(String nome, double localizacao) {
		this.nome = nome;
		this.localizacao = localizacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPatas() {
		return patas;
	}
	
	
	
	

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public double getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(double localizacao) {
		this.localizacao = localizacao;
	}
	
	public void mover() {
		System.out.println("-------- >");
		this.localizacao += 0.1;
	}

	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", patas=" + patas + ", velocidade=" + velocidade + ", localizacao="
				+ localizacao + "]";
	}
}
