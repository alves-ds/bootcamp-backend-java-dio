import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*Desafio 1 - Mostre a lista na ordem numérica:
Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console */

public class DesafioUm {

    public static void main(String[] args) {
        
        // declarar a lista
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Criar a stream e imprimi-la ordenadamente
        numeros.stream() // Inicia a stream
            .sorted() // ordena os numeros em ordem crescente
            .forEach(System.out::println); // exibe os numeros ordenados no console usando method reference
            /* .forEach(numero -> System.out.println(numero)); forma alternativa usando uma expressao lambda */

    }

}
