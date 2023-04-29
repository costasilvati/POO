
public class Lista1 {
	public static void main(String args[]) {
		House minhaCasa = new House();
		// Op 1 associar porta
		/*
		Door door1 = new Door();
		Door door2 = new Door();
		Door door3 = new Door();
		// Op 1 - associar portas
		minhaCasa.door1 = door1;
		minhaCasa.door2 = door2;
		minhaCasa.door3 = door3;
		*/
		// Op 2 associar porta
		minhaCasa.door1 = new Door();
		minhaCasa.door2 = new Door();
		minhaCasa.door3 = new Door();
		minhaCasa.door1.open();
		minhaCasa.color = "Azul";
		System.out.println("Existem " + minhaCasa.qHowDoorIsOpen() +
				" portas abertas");
		
	}
}
