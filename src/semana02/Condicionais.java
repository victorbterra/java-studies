package semana02;

public class Condicionais {
    public static void main(String[] args) {
        /*
        Imagine que seu código está tomando decisões como num jogo:
        "Se o jogador tiver mais de 10 de vida, ele continua... Senão, ele perde."
        Pra isso, usamos:

        if(condicao) {
        } else {
        }
        exemplo:
         */
        int idade = 17;
        if(idade >= 18){
            System.out.println("Você é maior de idade");
        }
        else {
            System.out.println("Você é menor de idade");
        }
        //Operadores lógicos
        //exemplo:
        boolean isMoney = true;
        boolean isOpen = false;
        if(isMoney && isOpen) {
            System.out.println("Você pode comprar o lanche");
        }
        else {
            System.out.println("Não dá pra comprar agora");
        }
        //Estrutura switch
        //É como um menu de opções.
        // Útil quando você tem vários caminhos diferentes pra um valor.
        int opcao = 2;
        switch(opcao) {
            case 1:
                System.out.println("Você escolheu a opção 1");
                break;
            case 2:
                System.out.println("Você escolheu a opção 2");
                break;
            default:
                System.out.println("Opção inválida");
        }
        //
    }
}
