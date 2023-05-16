
public class Bebida extends Produto {
	private String tipo;
	private String temperatura;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}
	@Override
	public String toString() {
		return "Bebida [tipo=" + tipo + ", temperatura=" + temperatura + "]";
	}
	
	
}
