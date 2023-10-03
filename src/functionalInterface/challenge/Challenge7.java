package functionalInterface.challenge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
*   Desafio 7 - Encontrar o segundo número maior da lista:
*   Com a ajuda da Stream API, encontre o segundo número maior da lista e
*   exiba o resultado no console.
*/
public class Challenge7 {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    Integer sortedNumbers = numbers.stream()
        .distinct()
        .sorted(Comparator.reverseOrder())
        .skip(1)
        .findFirst()
        .orElse(null);

    if(sortedNumbers != null) {
      System.out.println("O segundo maior número na lista é " + sortedNumbers);
    } else {
      System.out.println("Não há números na lista");
    }
  }
}
