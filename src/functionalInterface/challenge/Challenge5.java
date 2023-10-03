package functionalInterface.challenge;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

/*
*   Desafio 5 - Calcule a média dos números maiores que 5:
*   Com a Stream API, calcule a média dos números maiores que 5 e exiba o
*   resultado no console.
*/

public class Challenge5 {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    double average = numbers.stream()
        .filter(number -> number > 5)
        .mapToDouble(Integer::doubleValue)
        .average()
        .orElseThrow(() -> new NoSuchElementException("Não foi possivel encontrar a média"));

    System.out.println("A média dos números maiores que 5 é " + average);
  }
}
