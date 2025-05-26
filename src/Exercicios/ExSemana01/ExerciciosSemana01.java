package Exercicios.ExSemana01;

import java.util.Scanner;

public class ExerciciosSemana01 {
    public static void main(String[] args) {
        //Crie uma variável idade e imprima se a pessoa é maior de idade.

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        }
        else {
            System.out.println("Você é menor de idade.");
        }

        // Crie duas variáveis double, calcule a média entre elas

        double notaOne = 6.5;
        double notaTwo = 8.0;
        double media = (notaOne + notaTwo) / 2;
        if (media >= 7.0) {
            System.out.println("Sua média é: "+media+" Você está acima da média");
        } else {
            System.out.println("Sua média é: "+media+" Você está abaixo da média");
        }

        //Crie duas variáveis booleanas, depois use ! nela e imprima o resultado

        boolean ligado = true;
        boolean desligado = false;

        //Mostra o valor com o resultado true
        System.out.println("A lampada está ligada? "+ligado);
        // Mostra o valor com a negação aplicada
        System.out.println("O Carro está na garagem? "+!desligado);

        //Verifique se dois números são iguais usando !

        int numOne = sc.nextInt();
        int numTwo = sc.nextInt();
        boolean isSame = numOne == numTwo;
        System.out.println("Os números são iguais? " + isSame);


        //Some 10 com 5,depois subtraia 2 e mostre o resultado
        int result = (10 + 5)-2;
        System.out.println("O resultado de todas as somas é:"+ result);

    }
}
