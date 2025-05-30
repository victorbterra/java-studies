package Exercicios.ExSemana03;

import java.util.Scanner;

public class Exercicio05 {
    /*
    ✅ Exercício 5 – Tabuada personalizada
    Peça um número e use um for para imprimir a tabuada dele (de 1 a 10).
     */
    public static void main(String[] args) {
        //instanciando scanner
        Scanner sc = new Scanner(System.in);
        //o usuário digite um número
        System.out.println("DIGITE UM NÚMERO (DE 1 A 10) PARA SABER SUA TABUADA:");
        int numUser = sc.nextInt();
        // loop para calcular e imprimir o resultado da tabuada.
        for(int i=0;i <= 10; i++){
            int multiply = numUser * i;
            System.out.println(numUser + "x" + i +"="+ multiply);
        }
        sc.close();
    }
}
