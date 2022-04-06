public class ExemploString3 {
    public static void main(String[] args) {
        String texto = "Um bom programador sabe vasculhar a documentação";
        System.out.println(texto);
        System.out.println("Tamanho do texto "+ texto.length());
        System.out.println("Caracter da posição 20: " + texto.charAt(20));
        System.out.println("Sub-texto a partir da posição 10: " + texto.substring(10));
        System.out.println("Sub-texto da posição 5 até a 25: " + texto.substring(5,25));
        
        texto = "Ana gosta de banana nanica";
        String parteTexto = "na";
        String novoTexto = "ta";
        texto = texto.replace(parteTexto, novoTexto);
        System.out.println(texto);
        texto = texto.replaceFirst("ta", "na");
        System.out.println(texto);
    }
}
