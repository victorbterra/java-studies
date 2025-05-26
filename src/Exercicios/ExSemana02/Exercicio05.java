package Exercicios.ExSemana02;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        /*
        ✅ Exercício 5 – Entrada no parque
           Crie uma regra onde só entra no parque quem tem mais de 18 anos ou está acompanhado.
         */
        Scanner sc = new Scanner(System.in);
        // Perguntar qual é a idade ao usuário
        System.out.println("Digite sua idade:");
        int age = sc.nextInt();
        sc.nextLine();
        // Perguntar ao usuário se está acompanhado
        System.out.println("Você está acompanhado? (s/n)");
        String awnser = sc.nextLine();
        //Convertendo a resposta para boolean
        boolean isAGuardian = awnser.equalsIgnoreCase("s");

        if(age >= 18 || isAGuardian) {
            System.out.println("Você pode entrar no parque !");
        } else {
            System.out.println("Você não pode entrar no parque.");
        }

        sc.close();

    }
}
