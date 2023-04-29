import java.util.ArrayList;

public class Biblioteca {
	ArrayList<Livro> listaLivro = new ArrayList<>();
	
	public void adicionaLivro(Livro l) {
		listaLivro.add(l);
	}
	
	public void listarAcervo() {
		/*
		for(int i = 0; i< listaLivro.size(); i++) {
			System.out.println(listaLivro.get(i).toString());
		}*/
		for(Livro l : listaLivro) {
			System.out.println(l.toString());
		}
	}
}
