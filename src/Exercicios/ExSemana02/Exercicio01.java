package Exercicios.ExSemana02;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        /*
        ✅ Exercício 1 – Número positivo, negativo ou zero
        Crie um programa que recebe um número e imprime se ele é positivo, negativo ou zero.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int number = sc.nextInt();
        if(number > 0) {
            System.out.println("O número é positivo");
        }
        else if(number < 0){
            System.out.println("O número é negativo");
        } else {
            System.out.println("O Número é zero !");
        }

    }
}
