
public class Peixe extends Animal{
	private boolean agua;
	
	public Peixe(String nome, int patas, double velocidade, int localizacao) {
		super(nome, patas, velocidade, localizacao);
	}

	public boolean isAgua() {
		return agua;
	}

	public void setAgua(boolean agua) {
		this.agua = agua;
	}
	
	public void mover() {
		setLocalizacao(getLocalizacao()+1);
		System.out.println("Peixe \n ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n "
				+ "Local atual " + (super.getLocalizacao() * 
						            super.getVelocidade()));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
