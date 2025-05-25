import java.util.ArrayList;
import java.util.Scanner;

public class Matricula {

  Scanner s = new Scanner(System.in);
  
  Aluno aluno = new Aluno();
  Curso curso = new Curso();
  
  ArrayList<Matricula> matricula = new ArrayList<>();

  public Aluno getAluno() {
    return aluno;
  }
  public void setAluno(Aluno aluno) {
    this.aluno = aluno;
  }
  public Curso getCurso() {
    return curso;
  }
  public void setCurso(Curso curso) {
    this.curso = curso;
  }
  
  public Matricula(Aluno aluno, Curso curso) {
    this.aluno = aluno;
    this.curso = curso;
  }

  public Matricula() {
    // TODO Auto-generated constructor stub
  }
  
  public void matricular(Aluno aluno, Curso curso) {
    System.out.println("Digite o nome do aluno: ");
    aluno.setNome(s.next());
    System.out.println("Digite o nome do curso: ");
    curso.setNome(s.next());
    matricula.add(new Matricula(aluno, curso));
  }
  
  public void listar() {
    
    System.out.println("Digite o nome do curso para ver os alunos matriculados: ");
    aluno.setNome(s.next());
    
    for (Matricula matricula2 : matricula) {
      if(aluno.getNome().equals(matricula2.getCurso().getNome())) {
        System.out.println(matricula2.getAluno().getNome());
      }
    }
  }
}