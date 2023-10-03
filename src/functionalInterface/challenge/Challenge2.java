package functionalInterface.challenge;

import java.util.Arrays;
import java.util.List;

/*
*   Desafio 2 - Imprima a soma dos números pares da lista:
*   Utilizando a Stream API, realize a soma dos números pares da lista
*   e exiba o resultado no console.
*/

public class Challenge2 {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    int result = numbers.stream()
        .filter(number -> number % 2 == 0)
        .reduce(0, Integer::sum);

    System.out.println("A soma dos numeros pares é " + result);
  }
}
