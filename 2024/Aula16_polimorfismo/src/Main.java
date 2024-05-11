import java.util.ArrayList;

public class Main {
	public static void main(String args[]) {
		ArrayList<Animal> animaisCadastrados = new ArrayList<>();
		// Menu para cadastrar animais
		// 1 - Cadastrar Animal (como preencher diferntes animais??)
		// 2 - Listar Animais
		// 3 - Mover Animal
		Animal animal1 = new Animal("Texugo", 0.0);
		animal1.mover();
		System.out.println(animal1.toString());
		
		Peixe peixe1 = new Peixe("Peixe Espada", 0.3);
		peixe1.mover();
		System.out.println(peixe1.toString());
		
		Passaro passaro1 = new Passaro("Arpia", 9.2);
		passaro1.setVelocidade(0.6);
		passaro1.mover();
		System.out.println(passaro1.toString());
		animaisCadastrados.add(peixe1);
		animaisCadastrados.add(animal1);
		animaisCadastrados.add(passaro1);
	}
}
