package functionalInterface.challenge;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
*   Desafio 18 - Verifique se todos os números da lista são iguais:
*   Utilizando a Stream API, verifique se todos os números da lista
*   são iguais e exiba o resultado no console.
*/

public class Challenge18 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    Map<Integer, List<Integer>> groups = numbers.stream()
        .collect(Collectors.groupingBy(number -> number));

    List<Integer> repeatedNumbers = groups.entrySet()
        .stream()
        .filter(entry -> entry.getValue().size() > 1)
        .map(Map.Entry::getKey)
        .toList();

    System.out.println("Numeros repetidos" + repeatedNumbers);
  }
}
