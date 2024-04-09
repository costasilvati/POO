
public class Main {
	public static void main(String args[]) {
		Time2 objTime = new Time2(10); // Construtor com 1 parametro
		Time2 objTime2 = new Time2(10, 29); // Construtor com 2 parametros
		
		System.out.println("objTime tem os seguintes valores:"
				+ objTime.toString());
		System.out.println("objTime2 tem os seguintes valores:"
				+ objTime2.toString());
		Time2 start = new Time2(10, 29, 2); // Construtor com 3 parametros 
		System.out.println("-- "+ start.toString());
	}
}
