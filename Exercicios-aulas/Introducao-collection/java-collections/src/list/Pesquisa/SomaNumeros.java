package list.Pesquisa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {

    // Atributos
    List<Integer> numerosInteiros = new ArrayList<>(); 

    
    // Metodo construtor
    public SomaNumeros() {
        this.numerosInteiros = new ArrayList<>();
    }


    // Metodo para adicionar numeros na lista
    public void adicionarNumero(int numero){
        numerosInteiros.add(numero);
    }

    // Metodo para calcular a soma de todos os numeros na lista
    public int calcularSoma(){
        int soma = 0;
        for(int i: numerosInteiros){
            soma = soma + i;
        }
                return soma;
    }


    // Metodo para encontrar o maior numero
    public int encontrarMaiorNumero(){
        return Collections.max(numerosInteiros);
    }

    // Metodo alternativo usando um loop for
    //public int encontrarMaiorNumero() {
    //    int maior = Integer.MIN_VALUE; // Inicialize com o menor valor possível
    //    for (int i : numerosInteiros) {
    //        if (i > maior) {
    //            maior = i; // Atualize o maior valor
    //        }
    //    }
    //    return maior; // Retorne o maior valor
    //}


    // Metodo para encontrar o menor numero
    public int encontrarMenorNumero(){
        return Collections.min(numerosInteiros);
    }

    // Metodo para exibir os numeros
    public List<Integer> exibirNumeros(){
        return new ArrayList<>(numerosInteiros);
    }

    // Testar o codigo
    public static void main(String[] args) {

        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(3);
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
        somaNumeros.exibirNumeros();
        
    }
    

}
