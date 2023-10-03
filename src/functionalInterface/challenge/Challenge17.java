package functionalInterface.challenge;

import java.util.Arrays;
import java.util.List;

/*
*   Desafio 17 - Filtrar os números primos da lista:
*   Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
*/

public class Challenge17 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    List<Integer> primeNumbers = numbers.stream()
        .filter(Challenge17::isPrime)
        .toList();

    System.out.println("Os numeros primos são " + primeNumbers);
  }

  private static boolean isPrime(int n) {
    n = Math.abs(n);

    if(n <=1 ) {
      return false;
    }

    for (int i = 2; i * i <= n; i++){
      if(n % i == 0) {
        return  false;
      }
    }

    return true;
  }
}
