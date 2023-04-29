// Animal é a super classe de Reptil
public class Reptil extends Animal{
	private double temperatura;
	private boolean venenoso;
	
	public Reptil(String habitatNatural, String nome,double temperatura,boolean venenoso) {
		super(habitatNatural, nome);//parametros da superclasse
		this.temperatura = temperatura;
		this.venenoso = venenoso;
	}
	
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	
	public double getTemperatura() {
		return this.temperatura;
	}
	
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	public boolean getVenoso() {
		return this.venenoso;
	}
	
	public String toString() {
		return super.toString() + 
				"\n Reptil \n " + 
				"Temperatura: " + this.temperatura + 
				"\t Venonoso: " + this.venenoso;
	}
}
