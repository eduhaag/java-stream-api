package functionalInterface.challenge;

import java.util.Arrays;
import java.util.List;

/*
*   Desafio 13 - Filtrar os números que estão dentro de um intervalo:
*   Utilize a Stream API para filtrar os números que estão dentro de um intervalo
*   específico (por exemplo, entre 5 e 10) e exiba o resultado no console.
*/

public class Challenge13 {
  public static void main(String[] args) {
    int MIN = 5;
    int MAX = 10;
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    List<Integer> intervalNumbers = numbers.stream()
        .filter(number -> number >= MIN && number <= MAX )
        .toList();

    System.out.println("Os números no intervalo são " + intervalNumbers);
  }
}
