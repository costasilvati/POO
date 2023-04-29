
public class Eletronico extends Produto{
	private int voltagem;
	private String fonteDeEnergia;
	
	public int getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	public String getFonteDeEnergia() {
		return fonteDeEnergia;
	}
	public void setFonteDeEnergia(String fonteDeEnergia) {
		this.fonteDeEnergia = fonteDeEnergia;
	}
	@Override
	public String toString() {
		return super.toString() + "Eletronico [voltagem=" + voltagem + ", fonteDeEnergia=" + fonteDeEnergia + "]";
	}
	
	
	
}
