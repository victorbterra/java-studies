package Exercicios.ExSemana03;

import java.util.Scanner;

public class Exercicio04 {
    /*
        ✅ Exercício 4 – Somar 5 números digitados pelo usuário
        Use um loop para pedir 5 números e calcule a soma total
        deles usando um acumulador.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variável que guardará os números;
        int soma = 0;
        //loop que irá pedir os 5 números 5 vezes.
        for(int i= 0; i < 5; i++){
            //o usuário irá digitar o número
            System.out.println("DIGITE UM NÚMERO:");
            int numDigitado = sc.nextInt();
            //acréscimo do valor que já está na variável soma com o valor digitado pelo usuário.
            soma += numDigitado;
        }
        System.out.println("A soma dos 5 números é "+ soma);
    }
}
