package aula22;
import java.util.*;

public class TestaCollection {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		lista.add(10);
		lista.add(50);
		lista.add(41);
		lista.add(0);
		lista.add(-1);
		System.out.println("Array sem ordenação " + lista);
		Collections.sort(lista);
		System.out.println("Array COM ordenação " + lista);
		ArrayList<Integer> lista2 = new ArrayList<>();
		lista2.add(30);
		lista2.add(52);
		lista2.add(20);
		lista2.add(-10);
		lista2.add(100);
		System.out.println("Lista 2 " + lista2);
		System.out.println("Existem elementos repetidos nas duas listas?"
		+ Collections.disjoint(lista, lista2));
		System.out.println("Qual o valor minímo da lista1 "+
				Collections.min(lista) + " e máximo da lista2"
				+ Collections.max(lista2));
		Collections.reverse(lista2);
		System.out.println("Lista 2 reverse "+ lista2);
		System.out.println("----- Exemplos com String --------");
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Mariana");
		nomes.add("André");
		nomes.add("João Carlos");
		nomes.add("Matheus");
		System.out.println("Lista desordenada " + nomes);
		Collections.sort(nomes);
		System.out.println("Lista ordenada " + nomes);
		// Devolve negativo se não existe
		System.out.println("Busca o nome Juliana " 
				+ Collections.binarySearch(nomes, "Mariana"));
		ArrayList<String> nomes2 = new ArrayList<>();
		nomes2.add("Miguel");
		nomes2.add("Andreia");
		nomes2.add("Carlos");
		nomes2.add("Mariana");
		nomes2.add("Paulo");
		System.out.println("Existem elementos repetidos nas duas listas?"
				+ Collections.disjoint(nomes, nomes2));
		//Editar Mariana para Marina
		Collections.sort(nomes2);
		// binarySearch só funciona com array ordenado
		int index = Collections.binarySearch(nomes2, "Andreia");
		System.out.println("index busca binária "+ index);
		if(index > -1) {
			nomes2.set(index, "Marina");
			System.out.println("Lista editada "+ nomes2);
		}
		
		System.out.println("Frequencia de Paulo " 
				+ Collections.frequency(nomes2, "Paulo"));
		System.out.println("Minimo de nomes2 " 
				+ Collections.min(nomes2));
		System.out.println("Maximo de nomes2 " 
				+ Collections.max(nomes2));
		
		System.out.println("------ Array de Objetos Pessoa ------");
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		Pessoa p1 = new Pessoa("Antonio", "002", "29/05/1999");
		pessoas.add(p1);
		pessoas.add(new Pessoa("Marcos", "001", "23/02/1999"));
		pessoas.add( new Pessoa("Juliana", "003", "13/01/1999"));
		System.out.println("Pessoas sem ordenação "
				+ pessoas);
		Collections.sort(pessoas);
		System.out.println("Pessoas ordenadas "
				+ pessoas);
		System.out.println("Busca binária por p1 " 
				+ Collections.binarySearch(pessoas, p1));
		// String chave, valor obj Pessoa
		Map<String, Pessoa> mapPerson  = new HashMap<String, Pessoa>();
		// associa obj a chave
		mapPerson.put("Antonio Justino", p1);
		mapPerson.put("Antonio Justino", new Pessoa());
		mapPerson.put("Marcos Esteves", 
				new Pessoa("Marcos", "001", "23/02/1999"));
		mapPerson.put("Juliana Costa",
				new Pessoa("Juliana", "003", "13/01/1999"));
		System.out.println("Busca obj de chave Juliana Costa" + 
				mapPerson.get("Juliana Costa").toString());
		// Pessoa encontrada = mapPerson.get("Marcos Esteves");
		
	}
}
