package Lambdas;

public class Comparable {
	public static void borraElementos(Object[] a, ComparableI c) {
		for (int i = 0; i < a.length; i++) {
			if (c.comprobar(a[i])) {
				System.out.println(a[i]);
			}
		}
	}

	public static void main(String[] args) {
		Object[] a = { "Hola", 7.9, 10 };
		System.out.println("Números:");
		borraElementos(a, x -> x instanceof Number);
		System.out.println("\nStrings:");
		borraElementos(a, x -> x instanceof String);
	}
}

