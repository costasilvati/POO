/* Exercício sorteado:
3 Horário
Desenvolva uma aplicação em Java, que receba do usuário o tempo em segundos e escreva
em horas, minutos e segundos.*/

import java.util.Scanner;

public class Sorteio_18032026 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Digite um número inteiro em segundos:");
        int digitado = sc.nextInt();
        int segundos = digitado;
        System.out.println("O tempo digitado se refere a: ");
        int horas = segundos/3600;
        segundos -= (horas * 3600);
        int minutos = (segundos%3600)/60;
        segundos -= (minutos * 60);
        System.out.println(digitado+ " segundos é igual a "+ horas + "h, "+ minutos + "m. e "+ segundos + "seg." );
        
    }
}

// C:/AppData/Xampp/htdocs
