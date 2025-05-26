package Exercicios.ExSemana02;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        /*
            Exercício 4 – Login simples
        - Simule um sistema de login com duas variáveis: usuario e senha.
        - Se ambos estiverem corretos, imprima "Acesso permitido", senão "Acesso negado".
        - Dica: use .equals() para comparar strings!
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome de usuário:");
        String user = sc.next();
        System.out.println("Digite sua senha:");
        String password = sc.next();

        if(user.equals("admin") && password.equals("1234567")) {
            System.out.println("Acesso permitido.");
        } else  {
            System.out.println("Acesso negado.");
        }

    }
}
