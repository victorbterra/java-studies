package semana01;

public class Operadores {
    /*
    ============= OPERADORES =============
    São os símbolos que fazem contas ou comparações com variáveis.
    +  // soma
    -  // subtração
    *  // multiplicação
    /  // divisão
    %  // resto da divisão (módulo)
    */

    public static void main(String[] args) {
        int a = 30;
        int b = 3;
        int soma = a + b;
        int resto = a % b;
        System.out.println("A soma de "+a+"com "+b+" é "+soma);
        System.out.println("O resto da divisão "+a+"com "+b+" é "+resto);
        /*
        OPERADORES DE COMPARAÇÃO(QUE RETORNAM BOOLEAN)
        == //   igual a
        != //   diferente de
        >  //    maior que
        <  //    menor que
        >= //    maior ou igual
        <= //    menor ou igual
        */
        boolean resultado = (10 > 5); // o resultado retorna true
        System.out.println("A Condição da operação resultado é: "+resultado);
        /*
        OPERADORES LÓGICOS (USADOS COM BOOLEANOS)
        && //   E (and)
        || //   OU (or)
        !  //   NÃO(not)
        */
        //EXEMPLO
        boolean ligado = true;
        boolean funcionando = false;
        boolean status = ligado && funcionando; // false
    }

}
