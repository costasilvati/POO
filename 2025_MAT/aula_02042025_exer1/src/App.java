public class App {
    /*
      * Escreva uma classe chamada Pessoa com os 
      atributos:nome(tipoString), sexo (tipo char), idade (tipo int). 
      Escreva agora outra classe chamada Amigo, que é uma pessoa 
      (estende da classe Pessoa) de quem sabemos o dia de seu aniversário, 
      atributo diaDoAniversario (tipo String). Use encapsulamento e 
      forneça construtor padrão e construtor usando todos os atributos 
      para as duas classes.
     */
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa("Juliana", 'F', 37);
        System.out.println(p1.toString());
        Amigo am1 = new Amigo("José", 'M', 29, "20/02/2000");
        System.out.println(am1.toString());
    }
}
