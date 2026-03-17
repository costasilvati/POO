public class Ex2 {
    public static void main(String args[]){
        int valores[] = new int[10];
        // Ler valores
        for(int i=0; i<10; i++){
            System.out.println(i + " Digite um número");
            valores[i] = sc.nextInt();
        }
        // Exibir valores
        for(int j=0; j<10; j++){
            System.out.print(" - "+ valores[j]);
        }
        System.out.println("\nDigite o valor minimo:");
        int minimo = sc.nextInt();
        System.out.println("Digite o valor maximo");
        int maximo = sc.nextInt();
        System.out.println("Valores dentro do intervalo");
        for(int x=0; x<10; x++){
            if(valores[x] >= minimo && valores[x] <= maximo){
                System.out.print(" - "+ valores[x]);
            }
        }

    }
}
