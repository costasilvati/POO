public class Disciplina {
      private String nome;
      private int codigo;
      
      public Disciplina(String nome, int codigo) { 
            this.nome = nome;
            this.codigo = codigo;
      }

      public String toString() {
    	  return "Disciplina: " + nome + ", codigo: " + codigo; 
      } 
} 
----------------------------------------- ----------------------------- 
public class Professor {
      private Disciplina disciplina;
      private String data;
      
      public String toString() {
    	  return "Professor\nDisciplina: " + disciplina + ", data: " + data + '}';
      }
      public Professor(Disciplina disciplina, String data) { 
    	  this.disciplina = disciplina;
    	  this.data = data;
      }
      public Professor(Disciplina disciplina, String data) {
    	  this.disciplina = disciplina;
    	  this.data = data;
      }
	} 
}
---------------------------------------- -----------------------------
public class Programa {
	public static void main(String[] args) {
		Professor professor[] = new Professor[8];
		professor[0] = new Professor(new Disciplina(), "01/12/2022");
	} 
}

public class Programa {
	public static void main(String[] args) {
		Disciplina disc1 = new Disciplina("Português",012);
		Disciplina disc2 = new Disciplina("Matemática",016);
		Professor professor1 = new Professor(disc,"01/12/2022");
		System.out.println(professor1);
		Professor professor2 = new Professor(disc,"04/01/2023");
		System.out.println(professor2);
	} 
}

