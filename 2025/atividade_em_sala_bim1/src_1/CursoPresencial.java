public class CursoPresencial extends Curso{
    private String localidade;
  
    public CursoPresencial(String nome, int codigo, String localidade) {
      super(nome, codigo);
      this.localidade = localidade;
    }

    
  }
