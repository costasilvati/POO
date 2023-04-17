
public class Anfibio extends Animal{
	
	public Anfibio(String nome, int patas, double velocidade, int localizacao){
		super(nome, patas, velocidade,localizacao);
	}
	
	public void mover() {
		super.setLocalizacao(getLocalizacao()+1);
		System.out.println("Anfibio \n _   _   _   _ \n "
				+ "Local atual " + (super.getLocalizacao() * 
						            super.getVelocidade()));
	}

}
