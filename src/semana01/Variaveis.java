package semana01;

public class Variaveis {
    public static void main(String[] args) {
        //Variáveis de números inteiros (do tipo int)
        // suporta números inteiros de -2.147.483.648 a 2.147.483.647
        int variavelInteira = 10;
        System.out.println("Print da variavel "+variavelInteira+" Inteira");

        //Variáveis de números com casas decimais( do tipo double)
        // suporta números decimais de -1.7976931348623157E308 a 1.7976931348623157E308
        double height = 1.68;
        System.out.println("Maria tem "+ height + " de altura." );

        //Variaveis de um único caractere (do tipo char)
        // suporta apenas um único caractere, como 'a', 'b', 'c', etc.
        char letter = 'c';
        System.out.println("A letra nesta variável é "+letter);

        //Variáveis condicionais (do tipo boolean)
        // suporta apenas dois valores: true ou false
        boolean isDog = true;
        System.out.println("Maria tem cachorros?"+ isDog);

        //Variáveis de números decimais menores (do tipo float)
        // suporta números decimais de -3.40282347E+38 a 3.40282347E+38
        float peso = 75.5f;
        System.out.println("Maria tem "+peso +"Kg");

        //Variáveis de números inteiros grandes (do tipo long)
        // suporta números inteiros de -9.223372036854775808 a 9.223372036854775808
        long população = 10467366L;
        System.out.println("A população de Portugal tem "+população+" de habitantes.");

        //Variáveis de números inteiros pequenos (do tipo byte)
        // suporta números inteiros de -128 a 127
        byte level = 60;
        System.out.println("Seu personagem está no nível" + level);

        //Variáveis de números inteiros de tamanho intermediário (do tipo short)
        // suporta números inteiros de -32.768 a 32.767
        short pontos = 30000;
        System.out.println("Sua pontuação no jogo foi "+ pontos +" pontos.");

        //obs declarações do tipo String não são consideradas variáveis em Java, mas sim um objeto !

    }
}
