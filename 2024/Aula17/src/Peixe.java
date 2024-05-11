
public class Peixe extends Animal{
	private boolean aguaDoce;
	
	public Peixe (String nome, double localizacao) {
		super(nome, localizacao);
	}

	public boolean isAguaDoce() {
		return aguaDoce;
	}

	public void setAguaDoce(boolean aguaDoce) {
		this.aguaDoce = aguaDoce;
	}
	
	public void mover() {
		System.out.println("~ ~ ~ ~ ~ >>");
		double localAtual = super.getLocalizacao();
		localAtual += getVelocidade();
		super.setLocalizacao(localAtual);
	}

	@Override
	public String toString() {
		return "Peixe [aguaDoce=" + aguaDoce + ", Nome()=" + getNome() + ", Patas()=" + getPatas()
				+ ", Velocidade" + getVelocidade() + ", Localizacao =" + getLocalizacao()
				+ ", getClass()=" + getClass()+ "]";
	}
	
	
}
