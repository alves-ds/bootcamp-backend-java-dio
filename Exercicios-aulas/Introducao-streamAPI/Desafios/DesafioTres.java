/* Desafio 3 - Verifique se todos os números da lista são positivos:
Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console. */

import java.util.Arrays;
import java.util.List;

public class DesafioTres {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean resultadoTeste = numeros.stream()
            .allMatch(numero -> numero > 0); // Testa se todos os elementos da lista atendem a condição especificada entre parenteses

        System.out.println("Todos os numeros são positivos? -> " + resultadoTeste);
    }

}
