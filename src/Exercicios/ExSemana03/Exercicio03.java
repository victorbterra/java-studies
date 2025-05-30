package Exercicios.ExSemana03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        /*
        ✅ Exercício 3 – Senha com tentativa
         Use do-while para pedir que o usuário digite uma senha
         até acertar a senha correta.
         */
        //instanciando o input
        Scanner input = new Scanner(System.in);
        //objeto da senha correta
        String correctPassword = "1234567";
        //objeto do password digitado pelo usuário.
        String password;
        //condição de loop enquanto a senha não for igual;
        do {
            // o usuário digitará a senha
            System.out.println("DIGITE SUA SENHA:");
            password = input.next();
            //condição caso a senha digitada seja diferente da definida.
            if (!password.equals(correctPassword)){
                System.out.println("Senha incorreta.tente novamente");
            }
        }while (!password.equals(correctPassword));
        //caso a senha seja igual, sairá do loop e o código continua;
        System.out.println("Acesso liberado.");
        input.close();
    }
}
