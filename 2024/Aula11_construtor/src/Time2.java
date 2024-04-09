
public class Time2 {
	int hora;
	int minuto;
	int segundo;
	
	// Construtor
	public Time2(int hora, int minuto) {
		this.hora = hora;
		this.minuto = minuto;
	}
	//Sobrescrita de construtor
	public Time2(int hora) {
		this.hora = hora;
	}
	
	public Time2(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public Time2() {} // Construtor vazio
	
	public String toString() {
		return "Horas: " + this.hora +
				"\t Minutos: " + this.minuto +
				"\t Segundos: " + this.segundo; 
	}

}