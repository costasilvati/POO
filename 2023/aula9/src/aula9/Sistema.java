package aula9;

public class Sistema {
	public static void main(String args[]) {
		Funcionario func1 = new Funcionario(); // usando contrutor vazio
		Funcionario func2 = new Funcionario("858585858", 2350.9); // usando contrutor 2 parametros
		
		func1.setNome("Juliana");
		func1.setUltimoCod();
		
		func2.setNome("Helton");
		func2.setUltimoCod();
		
		System.out.println("F1: " + func1.getNome() + " ultimo Cod "+ func1.getUltimoCod());
		System.out.println("F2: " + func2.getNome() + " ultimo Cod "+ func2.getUltimoCod());
		
		Funcionario func3 = new Funcionario("7878787"); // usando contrutor 1 parametro
		System.out.println("F2: " + func3.getNome() + " ultimo Cod "+ func3.getUltimoCod());
		
		func1.setSalarioBase(1700.9);
		
		System.out.println("part. de lucros do Funcionario 1 eh "+ func1.calculaPl(10));		
		func1.toString();
		
		Agencia ag1 = new Agencia();
		ag1.funcAg = func1;
		// Impelemnte um modo de visualizar todos os dados de agencia
		// inclusive os dados dos funcionarios
		System.out.println(ag1.toString());
	}
}
