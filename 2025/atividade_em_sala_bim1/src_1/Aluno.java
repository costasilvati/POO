import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {

  Scanner s = new Scanner(System.in);
  
  private int id;
  private String nome;
  private String email;
  
  ArrayList<Aluno> alunos = new ArrayList<>();
  
  public Aluno(int id2, String nome2, String email2) {
    // TODO Auto-generated constructor stub
  }
  public Aluno(String nome2, String email2) {
    // TODO Auto-generated constructor stub
  }
  public Aluno() {
    // TODO Auto-generated constructor stub
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  
  public void cadastrar() {
    System.out.println("Digite o id: ");
    id = s.nextInt();
    System.out.println("Digite o nome: ");
    nome = s.next();
    System.out.println("Digite o email");
    email = s.next();
    alunos.add(new Aluno(id, nome, email));
  }
  
  public void editar(int id, String nome, String email) {
    alunos.set(id, new Aluno(nome, email));
  }
  
}