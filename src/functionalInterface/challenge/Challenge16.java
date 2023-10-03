package functionalInterface.challenge;

import java.util.Arrays;
import java.util.List;

/*
*   Desafio 16 - Agrupe os números em pares e ímpares:
*   Utilize a Stream API para agrupar os números em duas listas separadas,
*   uma contendo os números pares e outra contendo os números ímpares da lista original,
*   e exiba os resultados no console.
*/

public class Challenge16 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    List<Integer> pairNumbers = numbers.stream().filter(number -> number % 2 == 0).toList();
    List<Integer> oddNumbers = numbers.stream().filter(number -> number % 2 != 0).toList();

    System.out.println("Numeros pares: " + pairNumbers);
    System.out.println("Numeros impares: " + oddNumbers);


  }
}
