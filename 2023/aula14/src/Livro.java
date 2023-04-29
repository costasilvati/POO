public class Livro {
	private String titulo;
	private String autor;
	private int numeroExemplar;
	private boolean disponivel;
	
	public Livro(String titulo, String autor, int numExemplar, boolean disp) {
		this.autor = autor;
		this.titulo = titulo;
		this.numeroExemplar = numExemplar;
		this.disponivel = disp;
	}
	
	public Livro() {}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumeroExemplar() {
		return numeroExemplar;
	}
	public void setNumeroExemplar(int numeroExemplar) {
		this.numeroExemplar = numeroExemplar;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	public String toString() {
		return "Título: " + this.titulo +"\t"
				+ "Autor: " + this.autor +"\t"
				+ "Exemplar: " + this.numeroExemplar +"\t"
				+ "Disponível: " + this.disponivel;
	}

}
