import java.util.Scanner;
public class App {
      public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        Curso curso = new Curso();
        Matricula matricula = new Matricula();
        
        Scanner s = new Scanner(System.in);
        
        Integer num;
        
        do {
          System.out.println("Selecione: ");
          System.out.println("1 - Cadastrar aluno");
          System.out.println("2 - Cadastrar curso");
          System.out.println("3 - Matricular aluno");
          System.out.println("4 - Listar aluno");
          System.out.println("5 - Sair");
          num = s.nextInt();
          switch (num) {
          case 1:
            System.out.println("Cadastrar aluno: ");
            aluno.cadastrar();
            break;
          case 2:
            System.out.println("Cadastrar curso: ");
            curso.cadastrar();
            break;
          case 3:
            System.out.println("Matricular aluno: ");
            matricula.matricular(aluno, curso);
            break;
          case 4:
            System.out.println("Listar alunos: ");
            matricula.listar();
            break;
          case 5:
            System.out.println("Sair");
            break;
          default:
            break;
          }
        } while(num != 5);
        
        s.close();
        
      }
}
