
public class Passaro extends Animal {
	
	public Passaro(String nome, int patas, double velocidade, int localizacao){
		super(nome, patas, velocidade,localizacao);
	}
	
	public void mover() {
		super.setLocalizacao(getLocalizacao()+1);
		System.out.println("Pássaro \n ^ v ^ v ^ v ^ \n "
				+ "Local atual " + (super.getLocalizacao() * 
						            super.getVelocidade()));
	}

}
