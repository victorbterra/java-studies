package Exercicios.ExSemana02;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        /*
        ✅ Exercício 3 – Descubra o dia da semana com switch
        - Crie um int representando o número do dia (1 a 7)
        - use switch pra imprimir o nome do dia.
        - Se o número for inválido, imprima "Dia inválido".
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número(de 1 a 7) para descobrir o dia da semana");
        int numWeek = sc.nextInt();

        switch (numWeek) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia inválido");
                break;

        }
    }
}
