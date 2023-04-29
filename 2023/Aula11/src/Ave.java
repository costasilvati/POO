
public class Ave extends Animal{
	private int ovos;
	private boolean voa;
	private boolean mergulha;
	
	public Ave(String habitatNatural, String nome) {
		super(habitatNatural, nome);
	}
	
	public String toString() {
		return super.toString() +
				"\n Ave \n"+
				"Ovos: "+ this.ovos +
				"\t Voa: " + this.voa +
				"\t Mergulha: " + this.mergulha;
	}
	
}
