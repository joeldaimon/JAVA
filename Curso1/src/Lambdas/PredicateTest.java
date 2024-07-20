package Lambdas;
import java.util.function.Predicate;

public class PredicateTest {
	public static void main(String[] args) {
		Predicate<Integer> menores = i -> (i < 10);
		Predicate<Integer> mayores = menores.negate();
		System.out.println("¿Es menor que 10?: " + menores.test(10));
		System.out.println("¿Es mayor que 10?: " + mayores.test(10));
		Predicate<Integer> nuevo = menores.and(a -> a > 7).or(a -> a < 9); // AND OR
		System.out.println("¿Es menor que 10 y  9 < num > 7?: " + nuevo.test(8));
	}
}
