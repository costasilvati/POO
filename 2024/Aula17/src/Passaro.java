
public class Passaro extends Animal{
	
	public Passaro (String nome, double localizacao) {
		super(nome, localizacao);
	}
	
	public void mover() {
		System.out.println(" ^^ ^^ ^^ ^^ ");
		super.setLocalizacao(getLocalizacao() + getVelocidade());
	}
	
	public String toString() {
		return "Passaro [Nome()=" + getNome() + 
				", Patas()=" + getPatas()
				+ ", Velocidade" + getVelocidade() +
				", Localizacao =" + getLocalizacao()
				+ ", getClass()=" + getClass()+ "]";
	}
}
