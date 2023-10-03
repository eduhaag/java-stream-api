package functionalInterface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("Java", "Kotlin", "Python", "Javascript", "C", "Go", "Ruby");

    words.stream()
        .filter(word -> word.length() > 5)
        .forEach(System.out::println);
  }
}
