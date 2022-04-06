
public class ExemploString2 {
    public static void main(String[] args) {
        String texto1 = "Banana";
        String texto2 = "banana";
        
        if(texto1.equals(texto2)){
            System.out.println("[" +texto1 + "] é IGUAL a ["+ texto2 + 
                    "] segundo o método equals()");
        }else{
            System.out.println("[" +texto1 + "] é DIFERENTE a ["+ texto2 + 
                    "] segundo o método equals()");
        }
        //equalsIgnoreCase
        if(texto1.equalsIgnoreCase(texto2)){
            System.out.println("[" +texto1 + "] é IGUAL a ["+ texto2 + 
                    "] segundo o método equalsIgnoreCase()");
        }else{
            System.out.println("[" +texto1 + "] é DIFERENTE a ["+ texto2 + 
                    "] segundo o método equalsIgnoreCase()");
        }
        //compareTo
        /*
        Retorna a diferença entre a soma dos números que 
        representam os caracteres. Se for 0 são iguais, 
        senão retorna + ou - que zero
        */
        if(texto1.compareTo(texto2) == 0){
            System.out.println("[" +texto1 + "] é IGUAL a ["+ texto2 + 
                    "] segundo o método compareTo()");
        }else{
            System.out.println("[" +texto1 + "] é DIFERENTE a ["+ texto2 + 
                    "] segundo o método compareTo()");
        }
        
        // indexOf
        String ped = "a";
        int res = texto1.indexOf(ped);
        if (res != -1){
            System.out.println("indexOf: O sub texto [" + ped + 
                    "] foi laclizado na posição: " + res);
        }else{
            System.out.println("indexOf: O sub texto [" + ped + 
                    "] não foi laclizado. Resultado: " + res);
        }
        res = texto1.lastIndexOf(ped);
        if (res != -1){
            System.out.println("lastIndexOf: O sub texto [" + ped + 
                    "] foi laclizado na posição: " + res);
        }else{
            System.out.println("lastIndexOf: O sub texto [" + ped + 
                    "] não foi laclizado. Resultado: " + res);
        }
    }
}
