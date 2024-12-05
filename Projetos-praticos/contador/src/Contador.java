import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        // Criar o scanner para permitir inputs do terminal
        Scanner terminal = new Scanner(System.in);

        // Solicitar uma entrada para o parametro 1
        System.out.println("Digite o primeiro número: ");
        int parametroUm = terminal.nextInt();

        // Solicitar uma entrada para o parametro 2
        System.out.println("Digite o segundo número: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch (Exception e) {
            System.out.println("O segundo parâmetro deve ser maior do que o primeiro!");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        //validar se parametroUm é maior que o dois e lançar a exceção
        if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
        }

        // calcular o numero de vezes que o laço for sera executado
        int contagem = parametroDois - parametroUm;

        // realizar a contagem com base no numero de vezes calculado anteriormente
        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o valor: " + i);
        }

    }

}
