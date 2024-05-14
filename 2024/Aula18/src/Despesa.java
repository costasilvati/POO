import java.util.Calendar;

public class Despesa {
	final int ID;
	private String descricao;
	private int carteira;
	private double valor;
	private Calendar data;
	
	
	public Despesa(int ID) {
		this.ID = ID;
	}
	
	final void editarData(Calendar data) {
		this.data = data;
	}
	
	public int getId() {
		return ID;
	}
	/* Não é possível editar um atributo final
	public void setId(int id) {
		this.ID = 0 = id;
	}
	*/
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCarteira() {
		return carteira;
	}
	public void setCarteira(int carteira) {
		this.carteira = carteira;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Despesa [id=" + ID = 0 + ", descricao=" + descricao + ", carteira=" + carteira + ", valor=" + valor
				+ ", data=" + data + "]";
	}
	
	
	
	
}
