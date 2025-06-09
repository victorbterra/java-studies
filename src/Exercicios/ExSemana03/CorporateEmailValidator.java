package Exercicios.ExSemana03;
import java.util.Scanner;

public class CorporateEmailValidator {
    public static void main(String[] args) {
        // Criando um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        // Definindo o domínio esperado para o e-mail corporativo
        String expectedDomain = "@company.com";
        // Solicitando ao usuário que insira seu e-mail corporativo'
        System.out.println("Por favor, insira seu e-mail corporativo:");
        // Lendo a entrada do usuário
        String email = scanner.nextLine().trim();

        // Verificando se o e-mail contém o domínio esperado
        if (email.endsWith(expectedDomain)) {
            // Verificando se o e-mail contém um nome de usuário antes do domínio
            System.out.println("E-mail válido.");
        }
        else {
            // Se o e-mail não contém o domínio esperado, exibe uma mensagem de erro
            System.out.println("E-mail inválido.");
        }
        // Fechando o scanner
        scanner.close();
    }
}
