
public class Alimento extends Produto{
	private boolean perecivel;
	private String validade;
	
	
	public boolean isPerecivel() {
		return perecivel;
	}
	public void setPerecivel(boolean perecivel) {
		this.perecivel = perecivel;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	@Override
	public String toString() {
		return super.toString() + "Alimento [perecivel=" + perecivel + ", validade=" + validade + "]";
	}
	
	
}
