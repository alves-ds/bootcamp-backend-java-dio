import java.util.Arrays;
import java.util.List;

public class DesafioDois {

/* Desafio 2 - Imprima a soma dos números pares da lista:
Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console. */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer somaPares = numeros.stream() // Inicializa uma variavel do tipo integer, atribuindo-a como a stream inicializada na lista
            .filter(numero -> numero % 2 == 0) // filtra os numeros pares
            .reduce(0, (acumulador , numero) -> acumulador + numero); // utiliza o reduce para inicializar um acumulador em 0 e ir somando cada numero da lista a esse acumulador

        // Exibir o resultado
        System.out.println("O resultado da soma dos numeros pares é: " + somaPares);
            
    }

}
