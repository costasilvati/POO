import java.util.ArrayList;
import java.util.Scanner;

public class Curso {

  Scanner s = new Scanner(System.in);
  
  private String nome;
  private int codigo;
  
  ArrayList<Curso> cursos = new ArrayList<>();
  
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public int getCodigo() {
    return codigo;
  }
  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }
  
  public Curso(String nome, int codigo) {
    super();
    this.nome = nome;
    this.codigo = codigo;
  }
  public Curso() {
  }
  
  public void cadastrar() {
    System.out.println("Digite o nome:");
    nome = s.next();
    System.out.println("Digite o codigo: ");
    codigo = s.nextInt();
    cursos.add(new CursoOnline(nome, codigo));
  }
  
  public void cadastrar(String nome, int codigo, String localidade) {
    
    cursos.add(new CursoPresencial(nome, codigo, localidade));
  }
}

