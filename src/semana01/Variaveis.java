package semana01;

public class Variaveis {
    public static void main(String[] args) {
        //Variáveis de números inteiros (do tipo int)
        int variavelInteira = 10;
        System.out.println("Print da variavel "+variavelInteira+" Inteira");

        //Variáveis de números com casas decimais( do tipo double)
        double height = 1.68;
        System.out.println("Maria tem "+ height + " de altura." );

        //Variaveis de um único caractere (do tipo char)
        char letter = 'c';
        System.out.println("A letra nesta variável é "+letter);

        //Variáveis condicionais (do tipo boolean)
        boolean isDog = true;
        System.out.println("Maria tem cachorros?"+ isDog);

        //Variáveis de números decimais menores (do tipo float)
        float peso = 75.5f;
        System.out.println("Maria tem "+peso +"Kg");

        //Variáveis de números inteiros grandes (do tipo long)
        long população = 10467366L;
        System.out.println("A população de Portugal tem "+população+" de habitantes.");

        //Variáveis de números inteiros pequenos (do tipo byte)
        byte level = 60;
        System.out.println("Seu personagem está no nível" + level);

        //Variáveis de números inteiros de tamanho intermediário (do tipo short)
        short pontos = 30000;
        System.out.println("Sua pontuação no jogo foi "+ pontos +" pontos.");

        //obs declarações do tipo String não são consideradas variáveis em Java, mas sim um objeto !

    }
}
