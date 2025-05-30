package Exercicios.ExSemana03;

public class Exercicio02 {
    /*
    ✅ Exercício 2 – Contagem regressiva
    Use um for para fazer uma contagem regressiva de 10 até 1 e, ao final, imprima "Fogo!!!" 🚀
     */
    public static void main(String[] args) {
        System.out.println("COMEÇOU A CONTAGEM...");
        startCount();
    }

    public static void startCount() {
        for(int count = 10; count >= 1; count--){
            System.out.println(count);
        }
        System.out.println("Fogoooo ! \uD83D\uDE80");
    }
}
