// Operador final em Saude impede herança
public class Exames{ // extends Saude{
	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString() + "Exames [tipo=" + tipo + "]";
	}
}
