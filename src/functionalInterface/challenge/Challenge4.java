package functionalInterface.challenge;

import java.util.Arrays;
import java.util.List;

/*
*   Desafio 4 - Remova todos os valores ímpares:
*   Utilize a Stream API para remover os valores ímpares da lista
*   e imprima a lista resultante no console.
*/

public class Challenge4 {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
  }
}
