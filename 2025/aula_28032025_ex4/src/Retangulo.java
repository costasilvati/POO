public class Retangulo {
    private float lado1;
    private float lado2;
    // Construtores
    public Retangulo(){}

    public Retangulo(float lado1, float lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // Getters e Setters
    public float getLado1(){
        return this.lado1;
    }

    public void setLado1(float lado1){
        this.lado1 = lado1;
    }

    public float getLado2(){
        return this.lado2;
    }

    public void setLado2(float lado2){
        this.lado2 = lado2;
    }

    public float calculaArea(){
        return (lado1 * lado2);
    }

    public float calculaPerimetro(){
        return (2* this.lado1) + (2* this.lado2);
    }
}
