import java.util.ArrayList;

public class Pizza extends Produto implements Preparavel{
	private ArrayList<String> ingredientes;
	
	public Pizza() {
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
		return "Pizza [ingredientes=" + ingredientes + "]";
	}
}
