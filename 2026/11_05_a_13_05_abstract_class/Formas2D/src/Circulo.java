public class Circulo  extends Forma2D{ // necessário implementar area
    
    public Circulo(){super();}
    public Circulo (double altura, String nome){
        super(altura, nome);
    }

    public double area(){
        double pi = 3.14;
        double raio = getAltura()/2;
        return (raio* raio)*pi;
    }

    public String toString(){
        return "Círculo: [raio: "+ (getAltura()/2) + ", diametro: "+ getAltura()+"]";
    }

}
