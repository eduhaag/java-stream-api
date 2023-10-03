package functionalInterface.challenge;

import com.sun.tools.javac.Main;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
*   Desafio 14 - Encontre o maior número primo da lista:
*   Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
*/
public class Challenge14 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    Integer largestPrimeNumber = numbers.stream()
        .filter(Challenge14::isPrime)
        .max(Integer::compareTo).orElse(null);

    System.out.println("O maior numero primo é  " + largestPrimeNumber);
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
