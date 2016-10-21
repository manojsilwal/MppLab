package pro_1;

import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OneA {
	public static void main(String[] args) {
		IntStream.generate(() -> 1).distinct().forEach(System.out::println);;
		Stream.iterate(1, n->n+1).limit(20).forEach(System.out::println);
		}
}
