package functionalInterface.challenge;

import java.util.Arrays;
import java.util.List;

/*
*   Desafio 3 - Verifique se todos os números da lista são positivos:
*   Com a ajuda da Stream API, verifique se todos os números da lista são
*   positivos e exiba o resultado no console.
*/

public class Challenge3 {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    boolean areAllNumbersPositive = numbers.stream().allMatch(number -> number >=0);

    if (areAllNumbersPositive) {
      System.out.println("Todos os numeros na lista são positivos.");
    } else {
      System.out.println("Existem números negativos na lista.  ");
    }
  }
}
