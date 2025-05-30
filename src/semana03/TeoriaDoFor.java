package semana03;

public class TeoriaDoFor {
    public static void main(String[] args) {
        /*  Laço do-while
            Igual ao while, mas garante que executa pelo menos uma vez
            (mesmo que a condição seja falsa já no início).
            exemplo:
         */
        int contador = 0;
        do {
            System.out.println("Valor de i: " + contador);
            contador++;
        } while (contador < 5);
        System.out.println("Fim do laço do-while");
    }
}
