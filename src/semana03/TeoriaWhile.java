package semana03;

public class TeoriaWhile {
    public static void main(String[] args) {
        /*
        ✅ Teoria While
        A estrutura de repetição while (enquanto) é usada para executar um bloco de código enquanto uma condição for verdadeira.
        A sintaxe básica é:

        while (condição) {
            // bloco de código a ser executado
        }

        Exemplo:
        int i = 0;
        while (i < 5) {
            System.out.println("Valor de i: " + i);
            i++;
        }

        Neste exemplo, o loop continuará enquanto i for menor que 5, imprimindo o valor de i e incrementando-o a cada iteração.

        ⚠️ Dica:
        Se a condição nunca ficar falsa, o programa entra num loop infinito! Cuidado com isso, hein 😅
         */

        int contador = 1;
        while (contador <= 5) {
            System.out.println("Acrescendo " + contador);
            contador++;
        }
    }
}
