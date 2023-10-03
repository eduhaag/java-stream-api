package functionalInterface.challenge;

import java.util.Arrays;
import java.util.List;

/*
*   Desafio 6 - Verificar se a lista contém algum número maior que 10:
*   Utilize a Stream API para verificar se a lista contém algum número
*   maior que 10 e exiba o resultado no console.
*/

public class Challenge6 {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 13, 15);

    List<Integer> numbersGreaterThan10 = numbers.stream().filter(number -> number > 10).toList();

    if(!numbersGreaterThan10.isEmpty()){
      System.out.println("Os números maiores que 10 são: " + numbersGreaterThan10);
    } else {
      System.out.println("Não há números maiores que 10 na lista.");
    }

  }
}
