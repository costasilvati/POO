/*
 - Crie uma classe para representar uma pseudo calculadora, que possui dois
números inteiros como atributos. 
 - Nessa classe, os dois atributos devem ser privados. 
 - Por isso, criem também os métodos que irão acessar os atributos
(getters e setters). 
 - Crie também métodos para realizar as seguintes operações com os dois atributos: 
 - soma, subtração, divisão e mulLplicação.
*/

public class Calculadora {
    private int valor1;
    private int valor2;

    // get e set
    public int getValor1(){return this.valor1;}
    public void setValor1(int valor1){this.valor1 = valor1;}
    public int getValor2(){return this.valor2;}
    public void setValor2(int valor2){this.valor2 = valor2;}

    // métodos da calculadora
    public int soma(){
        return this.valor1 + this.valor2;
    }
    public int subtracao(){
        return this.valor1 - this.valor2;
    }

    public int multiplicacao(){
        return this.valor1 * this.valor2;
    }

    public float divisao(){
        return this.valor1/this.valor2; // pode ser necessário converter
    }

    public String toString(){
        return "Valor 1: "+this.valor1 + "\t"
                +"Valor 2: " + this.valor2;
    }
}
