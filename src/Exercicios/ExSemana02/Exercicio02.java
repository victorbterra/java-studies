package Exercicios.ExSemana02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        /*
        ✅ Exercício 2 – Pode dirigir?
        Crie duas variáveis: idade e temCarteira (tipo boolean). Use if com && pra dizer se a pessoa pode dirigir ou não.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a idade:");
        int idade = sc.nextInt();
        // variável tem Carteira
        boolean isCard = true;
        if(idade >= 18 && isCard == true) {
            System.out.println("Você pode dirigir.");
        } else {
            System.out.println("Você não pode dirigir.");
        }

    }
}
