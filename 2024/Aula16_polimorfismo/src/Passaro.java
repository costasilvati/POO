
public class Passaro extends Animal{
	
	public Passaro (String nome, double localizacao) {
		super(nome, localizacao);
	}
	
	public void mover() {
		System.out.println(" ^^ ^^ ^^ ^^ ");
		super.setLocalizacao(getLocalizacao() + getVelocidade());
	}
}
