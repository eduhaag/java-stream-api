package functionalInterface.examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {

  public static void main(String[] args) {

    List<String> salutationsList = Stream.generate(() -> "Olá, seja bem vindo(a)!")
        .limit(5)
        .toList();

    salutationsList.forEach(System.out::println);
  }
}
