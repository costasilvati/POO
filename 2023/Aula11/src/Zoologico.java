import java.util.Scanner;

public class Zoologico {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Animal zebra = new Animal();
		System.out.println("Nome do animal");
		zebra.setNome(sc.next());
		sc.reset();
		System.out.println("Altura do animal");
		zebra.setAltura(sc.nextDouble());
		System.out.println("Peso do animal");
		zebra.setPeso(sc.nextDouble());	
		sc.reset();
		System.out.println("Habitat do animal");
		zebra.setHabitatNatural(sc.next());	
		sc.reset();
		//System.out.println(zebra.toString());
		
		Recinto recinto1 = new Recinto();
		recinto1.setArea(150);
		recinto1.setBioma("Savana");
		recinto1.setAnimal(zebra);
		System.out.println(recinto1.toString());
		
		Reptil cobra = new Reptil();
		cobra.alimentado();
		cobra.setNome("Seleste");
		
		Recinto recinto2 = new Recinto();
		recinto2.setBioma("Antartico");
		recinto2.setAnimal(cobra);
		zebra.alimentado();
	}
}
