
public class Produto {
	private int codigo;
	private String descricao;
	private int estoque;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", estoque=" + estoque + "]";
	}
	
	
	
}
