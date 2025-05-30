package Exercicios.ExSemana03;

import java.util.Scanner;

public class Exercicio06 {
    /*
    ✅ Desafio Extra (nível "jogador curioso")
     Crie um programa que pergunte quantos números
     você quer digitar e, com base nisso,
     faça a soma e calcule a média desses números.
     Use acumulador + contador + while ou for.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("QUANTOS NÚMEROS QUER DIGITAR?");
        int countNum = sc.nextInt();
        int result = 0;
        for(int i=1; i<=countNum; i++){
            System.out.println("DIGITE "+countNum+" NÚMEROS: ");
            int digitNum = sc.nextInt();
            result += digitNum;
        }
        System.out.println("A SOMA DESSES "+ countNum + " NÚMEROS É: "+result);
    }
}
