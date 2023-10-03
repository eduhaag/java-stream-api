package functionalInterface.challenge;

import java.util.Arrays;
import java.util.List;

/*
*   Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
*   Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo
*   e exiba o resultado no console.
*/

public class Challenge15 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, -6, 7, 8, 9, 10, -5, 4, 3);

    List<Integer> negativeNumbers = numbers.stream()
        .filter(number -> number < 0)
        .toList();

    if(!negativeNumbers.isEmpty()){
      System.out.println("Os numeros negativos são " + negativeNumbers);
    } else {
      System.out.println("Não há números negativos na lista.");
    }
  }
}
