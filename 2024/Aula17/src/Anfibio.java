
public class Anfibio extends Animal{
	
	public Anfibio(String nome, double localizacao) {
		super(nome, localizacao);
	}
	
	public void mover() {
		System.out.println("-  -  - ---   - - --");
		setLocalizacao(getLocalizacao() + getVelocidade());
	}

	@Override
	public String toString() {
		return "Anfibio [Nome =" + getNome() + ", Patas =" + getPatas() + 
				", Velocidade = " + getVelocidade()
				+ ", Localizacao = " + getLocalizacao() + ", getClass =" + getClass() + "]";
	}
	
	
	
	
}
