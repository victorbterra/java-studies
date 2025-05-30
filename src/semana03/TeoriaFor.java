package semana03;

public class TeoriaFor {
    public static void main(String[] args) {
        /*
        ✅ Teoria For
        A estrutura de repetição for é usada para executar um bloco de código um número específico de vezes.
        A sintaxe básica é:

        for (inicialização; condição; incremento) {
            // bloco de código a ser executado
        }

        Exemplo:
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor de i: " + i);
        }

        Neste exemplo, o loop for executa 5 vezes, imprimindo o valor de i de 1 a 5.

        ⚠️ Dica:
        O loop for é ideal quando você sabe exatamente quantas vezes deseja repetir um bloco de código.
         */

        for (int contador = 1; contador <= 5; contador++) {
            System.out.println("Acrescendo " + contador);
        }
    }
}
