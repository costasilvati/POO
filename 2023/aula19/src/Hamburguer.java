import java.util.ArrayList;

public class Hamburguer extends Produto implements Preparavel{
	private ArrayList<String> ingredientes;
	
	public Hamburguer() {
		ingredientes = new ArrayList<>();
	}

	public void addIngrediente(String ing) {
		this.ingredientes.add(ing);
	}
	
	public ArrayList<String> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<String> ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	public String fabricar() {
		String menssagem = "Seu pizza está sendo preparada \n Ingredientes:";
		for(String ing : ingredientes) {
			menssagem = menssagem + " - "+ing;
		}
		return menssagem;
	}

	@Override
	public String toString() {
		return "Hamburguer [ingredientes=" + ingredientes + "]";
	}
	
	
}
